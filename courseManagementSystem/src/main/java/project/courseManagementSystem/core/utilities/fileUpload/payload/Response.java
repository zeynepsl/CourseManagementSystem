package project.courseManagementSystem.core.utilities.fileUpload.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

//Bu Response sınıfı, uploadFile ve 
//uploadMultipleFiles API'lerinden yanıt döndürmek için kullanılır .

@Data
@AllArgsConstructor
public class Response {
	private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;
    
    
}
