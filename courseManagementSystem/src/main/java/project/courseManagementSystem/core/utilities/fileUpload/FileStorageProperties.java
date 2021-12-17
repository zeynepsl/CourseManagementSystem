package project.courseManagementSystem.core.utilities.fileUpload;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "file")
/*Ek açıklama uygulama başlatma ve bağlar öneki ile tüm özellikleri üzerinde işini yapar filePOJO sınıfının karşılık gelen alanlarına.

fileGelecekte ek özellikler tanımlarsanız , yukarıdaki sınıfa karşılık gelen bir alan ekleyebilirsiniz ve yaylı çizme, alanı özellik değeriyle otomatik olarak bağlayacaktır.*/
//Tüm dosya depolama özelliklerini bağlamak için
//ileStorageProperties adında bir POJO sınıfı
/*Spring Boot, dosyada @ConfigurationPropertiestanımlanan özellikleri application.propertiesbir POJO sınıfına otomatik olarak bağlayabileceğiniz, using adlı harika bir özelliğe sahiptir .

Tüm dosya depolama özelliklerini bağlamak için paketin FileStoragePropertiesiçinde adlı bir POJO sınıfı tanımlayalım*/
public class FileStorageProperties {
	private String uploadDir;
}
