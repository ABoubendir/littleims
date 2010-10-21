// ========================================================================
// Copyright 2008-2009 NEXCOM Systems
// ------------------------------------------------------------------------
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at 
// http://www.apache.org/licenses/LICENSE-2.0
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// ========================================================================
package org.cipango.littleims.scscf.oam;

import org.apache.wicket.markup.html.CSSPackageResource;
import org.apache.wicket.markup.html.JavascriptPackageResource;
import org.apache.wicket.markup.html.panel.Panel;
import org.cipango.ims.oam.SpringApplication;
import org.cipango.ims.oam.util.AutolinkBookmarkablePageLink;
import org.cipango.littleims.scscf.oam.browser.ProfileBrowserPage;
import org.cipango.littleims.scscf.oam.browser.RegistrationBrowserPage;
import org.cipango.littleims.scscf.oam.browser.SessionBrowserPage;
import org.cipango.littleims.scscf.oam.browser.SharedIfcBrowserPage;

public class HeaderPanel extends Panel
{

	@SuppressWarnings("unchecked")
	public HeaderPanel()
	{
		super("header");
		add(new AutolinkBookmarkablePageLink("ProfileBrowserPage", ProfileBrowserPage.class));
		add(new AutolinkBookmarkablePageLink("SessionBrowserPage", SessionBrowserPage.class));
		add(new AutolinkBookmarkablePageLink("RegistrationBrowserPage", RegistrationBrowserPage.class));
		add(new AutolinkBookmarkablePageLink("SharedIfcBrowserPage", SharedIfcBrowserPage.class));
		add(CSSPackageResource.getHeaderContribution(SpringApplication.class, "style/style.css"));
		add(CSSPackageResource.getHeaderContribution(SpringApplication.class, "style/style-littleims.css"));
		add(JavascriptPackageResource.getHeaderContribution(SpringApplication.class, "common-util.js"));
	}
	


}
