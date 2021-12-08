package project.courseManagementSystem.core.utilities.fileUpload;

import org.springframework.web.multipart.MultipartFile;

import project.courseManagementSystem.core.utilities.results.DataResult;

public interface FileService {
	DataResult<?> fileUpload(MultipartFile file);
}
