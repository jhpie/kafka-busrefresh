package com.example.generatorYaml.vo;

import lombok.Data;

@Data
public class RequestUpdateRouter {
    private String target_id;
    private String update_id;
    private String update_uri;
}
