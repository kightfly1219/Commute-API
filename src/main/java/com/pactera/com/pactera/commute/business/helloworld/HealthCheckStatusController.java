package com.pactera.com.pactera.commute.business.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author yang.bin
 */
@RestController
public class HealthCheckStatusController {

    @Value("${commute.info.project-name}")
    private String projectName;
    @Value("${commute.info.project-version}")
    private String projectVersion;

    /**
     * サービス健康チェック
     *
     * @return リスポンス
     */
    @RequestMapping(value = "/api/hcs/service", method = RequestMethod.GET)
    public String service() {
        return projectName.concat(":").concat(projectVersion).concat(" ").concat(LocalDateTime.now().toString());
    }
}
