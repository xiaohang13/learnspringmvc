package com.nfmedia.springmvc.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/1/9.
 */

@Controller
@RequestMapping("/file")
public class FileUploadController {

    @RequestMapping("/index")
    public String index() {
        return "fileupload/upload";
    }

    @RequestMapping("/upload")
    public String fileupload(@RequestParam(value = "desc") String desc, @RequestParam("file") MultipartFile file)
            throws IOException {
        System.out.println("desc: " + desc);
        System.out.println("OriginalFileName: " + file.getOriginalFilename());
        System.out.println("InputStream: " + file.getInputStream());
        return "fileupload/upload";
    }
}
