package project.courseManagementSystem.core.utilities.fileUpload;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "file")

//Tüm dosya depolama özelliklerini bağlamak için
//FileStorageProperties adında bir POJO sınıfı
/*Spring Boot, dosyada @ConfigurationPropertiestanımlanan özellikleri 
 * application.properties bir POJO sınıfına otomatik olarak bağlayabilecek, using adlı bir özelliğe sahip

Tüm dosya depolama özelliklerini bağlamak için paketin FileStorageProperties içinde bir POJO sınıfı tanımlayalım*/
public class FileStorageProperties {
	private String uploadDir;
}
