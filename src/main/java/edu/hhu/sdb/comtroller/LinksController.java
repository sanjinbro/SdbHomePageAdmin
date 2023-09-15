package edu.hhu.sdb.comtroller;

import edu.hhu.sdb.pojo.Links;
import edu.hhu.sdb.service.LinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sanjin 2023-09-15 14:41
 */
@RestController
@RequestMapping("/links")
public class LinksController {
    @Autowired
    private LinksService linksService;

    // 此接口为测试项目使用，健壮性不够，请勿直接使用。
    @GetMapping("/findAll")
    public List<Links> findAll() {
        return linksService.list();
    }
}
