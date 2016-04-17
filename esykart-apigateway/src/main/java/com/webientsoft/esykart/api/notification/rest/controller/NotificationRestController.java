/*
 * Copyright (c) 2016, WebientSoft and/or its affiliates. All rights reserved. 
 * WebientSoft PROPRIETARY/CONFIDENTIAL.Use is subject to license terms.
 */

package com.webientsoft.esykart.api.notification.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.webientsoft.esykart.api.notification.service.NotificationService;

/**
 * 
 * @author DeepakT
 * @since 1.0
 */
@RestController("/notifications")
public class NotificationRestController {

	@Autowired
	private NotificationService notificationService;
}
