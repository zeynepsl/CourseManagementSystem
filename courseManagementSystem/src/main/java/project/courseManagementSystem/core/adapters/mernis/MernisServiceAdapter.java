package project.courseManagementSystem.core.adapters.mernis;

import java.rmi.RemoteException;
import java.util.Locale;

import org.springframework.stereotype.Component;

import project.courseManagementSystem.entities.concretes.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Component
public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(
					Long.parseLong(user.getNationalityId()), 
					user.getFirstName().toUpperCase(new Locale("tr")), 
					user.getLastName().toUpperCase(new Locale("tr")),
					user.getBirthDate().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		
		return result;
	}

}
