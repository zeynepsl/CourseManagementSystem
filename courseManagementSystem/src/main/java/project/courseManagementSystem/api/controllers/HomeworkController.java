package project.courseManagementSystem.api.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import project.courseManagementSystem.business.abstracts.HomeworkService;
import project.courseManagementSystem.core.utilities.fileUpload.payload.Response;
import project.courseManagementSystem.core.utilities.fileUpload.service.FileStorageService;
import project.courseManagementSystem.core.utilities.results.DataResult;
import project.courseManagementSystem.core.utilities.results.Result;
import project.courseManagementSystem.entities.concretes.Homework;

@RestController
@RequestMapping("/api/homeworks")
public class HomeworkController {
	private HomeworkService homeworkService;
	private static final Logger logger = LoggerFactory.getLogger(HomeworkController.class);

    @Autowired
    private FileStorageService fileStorageService;
	
	@Autowired
	public HomeworkController(HomeworkService homeworkService) {
		super();
		this.homeworkService = homeworkService;
	}
	
	@RequestMapping(value = "/schedulebatch",method = RequestMethod.POST)
			public @ResponseBody DataResult<Response> add(@RequestPart("upfile") MultipartFile upfile, int studentId) throws Exception {  
		return homeworkService.upload(upfile, studentId);
		}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return homeworkService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Homework homework) {
		return homeworkService.update(homework);
	}
	
	@GetMapping("/getById")
	public DataResult<Homework> getById(int id) {
		return homeworkService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Homework>> getAll() {
		return homeworkService.getAll();
	}
	
	@GetMapping("/downloadFile/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        Resource resource = fileStorageService.loadFileAsResource(fileName);

        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            logger.info("Could not determine file type.");
        }

        if(contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
	
}
