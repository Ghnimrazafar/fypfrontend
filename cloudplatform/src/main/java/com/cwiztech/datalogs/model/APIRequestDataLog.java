package com.cwiztech.datalogs.model;

import org.springframework.util.MultiValueMap;

public @interface APIRequestDataLog {

	MultiValueMap getREQUEST_OUTPUT();

}
