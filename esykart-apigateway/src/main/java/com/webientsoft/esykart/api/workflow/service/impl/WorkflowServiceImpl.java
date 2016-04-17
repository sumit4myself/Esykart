/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.workflow.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webientsoft.esykart.api.workflow.service.WorkflowService;
import com.webientsoft.esykart.api.workflow.service.client.WorkflowServiceClient;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@Service
public class WorkflowServiceImpl implements WorkflowService {

	@Autowired
	private WorkflowServiceClient wfServiceClient;
}
