/* 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.examproject.mgnl.component;

import javax.jcr.Node;
import javax.jcr.Property;
import javax.jcr.RepositoryException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import info.magnolia.module.blossom.annotation.TabFactory;
import info.magnolia.module.blossom.annotation.Template;
import info.magnolia.module.blossom.annotation.TemplateDescription;
import info.magnolia.module.blossom.dialog.TabBuilder;

/**
 * @author hiroxpepe
 */
@Controller
@Template(
    id="exmp-mgnl-blossom:components/sideBarLinkItem",
    title="SideBar Link Item"
)
@TemplateDescription("the component of a sidebar link item.")
public class SideBarLinkItemComponent {
    
    private static final Logger LOG = LoggerFactory.getLogger(
        SideBarLinkItemComponent.class
    );
    
    ///////////////////////////////////////////////////////////////////////////
    // public methods
    
    @RequestMapping("/sideBarLinkItem")
    public String render(
        ModelMap model,
        Node content
    ) throws RepositoryException {
        LOG.debug("called.");
        
        return "components/sideBarLinkItem.jsp";
    }
    
    @TabFactory("SideBar Link Item")
    public void addDialog(TabBuilder tab) {        
        tab.addEdit(
            "linkText",
            "Link Text",
            "a link text of the sidebar item."
        );
        
        tab.addLink(
            "link",
            "Link URL",
            "a link url of the sidebar item."
        );
    }
    
}
