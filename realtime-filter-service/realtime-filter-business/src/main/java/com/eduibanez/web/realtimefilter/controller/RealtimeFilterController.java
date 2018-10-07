package com.eduibanez.web.realtimefilter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eduibanez.web.realtimefilter.rest.request.FilterRequest;
import com.eduibanez.web.realtimefilter.rest.response.FilterResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api
@RestController
@RequestMapping("realtime-filter/")
public class RealtimeFilterController {

	/** The logger. */
    private static final Logger logger = LoggerFactory.getLogger(RealtimeFilterController.class);

    @RequestMapping(method = RequestMethod.GET, value = "statuses/")
    @ApiOperation(value = "statuses", nickname = "statuses", response = FilterResponse.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
            @ApiResponse(code = 201, message = "Created"), @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure") })
    public FilterResponse getStatuses(
            @ApiParam(value = "request", required = true) @RequestBody(required = true) FilterRequest request) {

        return new FilterResponse();
    }
}