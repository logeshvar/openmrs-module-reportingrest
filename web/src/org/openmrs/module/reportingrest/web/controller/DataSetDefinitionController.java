/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.reportingrest.web.controller;

import org.openmrs.module.reporting.dataset.definition.DataSetDefinition;
import org.openmrs.module.reportingrest.web.resource.DataSetDefinitionResource;
import org.openmrs.module.webservices.rest.web.v1_0.controller.BaseCrudController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for {@link DataSetDefinition}s
 *
 */
@Controller
@RequestMapping(value = "/rest/reporting/datasetdefinition")
public class DataSetDefinitionController extends BaseCrudController<DataSetDefinitionResource> {

}
