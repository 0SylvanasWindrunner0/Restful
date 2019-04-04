package com.example.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.javaman.pojo.MicroUser;
import com.javaman.utils.IOUtil;

@RestController
@RequestMapping("/micro")
public class microController {
	
	@GetMapping
	public List<MicroUser>getAll(){
		List<MicroUser>  list = new ArrayList<>();
		list.add(new MicroUser());
		return list;
	}
	
	@GetMapping("/{id}")
	public MicroUser getOne(@PathVariable Integer id){
		if(id!=null){
			return new MicroUser(id,"JavaMan","1505121114",1,22,"","",20,"");
		}
		return null;
	}
	
	@PostMapping
	public MicroUser insertOne(@RequestBody MicroUser microUser){
		if(microUser!=null){
			microUser.setId(999);
			return microUser;
		}
		return null;
	}
	
	@PutMapping("/{id}")
	public MicroUser updateOne(@PathVariable Integer id,@RequestBody MicroUser microUser){
		if(id!=null){
			return microUser;
		}
		return null;
	}
	
	@DeleteMapping("/{id}")
	public Map<String,String> deleteOne(@PathVariable Integer id, HttpServletRequest request,
			@RequestParam(value="delete_reason",required=false) String delete_reason)throws Exception{
		Map<String,String> result = new HashMap<>();
		if(id!=null){
			result.put("message", id+"被"+request.getRemoteAddr()+"删除，原因："+delete_reason);
			return result;
		}
		return null;		
	}
	
	@PostMapping(value="/{id}/photos",consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public void addPhoto(@PathVariable Integer id,@RequestParam("photo") MultipartFile imgFile) throws Exception{
		//上传文件，保存文件
		FileOutputStream fos = new FileOutputStream("target/photos/"+imgFile.getOriginalFilename());
		IOUtils.copy(imgFile.getInputStream(), fos);
		System.out.println("ok");
		fos.close();
	}
	
	@GetMapping(value="/{id}/photos",produces=MediaType.IMAGE_JPEG_VALUE)
	public byte[] getPhoto(@PathVariable Integer id)throws Exception{
		String photoFile = "target/photos/3.jpg";
		System.out.println("ok1");
		InputStream is = new FileInputStream(photoFile);
		
		return IOUtil.toByteArray(is);
	}
	
	
	
}
