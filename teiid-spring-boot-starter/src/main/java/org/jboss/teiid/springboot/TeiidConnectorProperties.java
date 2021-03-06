/*
 * Copyright 2012-2017 the original author or authors.
 *
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

package org.jboss.teiid.springboot;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "teiid")
public class TeiidConnectorProperties {

    private Set<String> translators = new HashSet<>();
    
    private Set<String> vdbs = new HashSet<>();
    
    private Set<String> ddls = new HashSet<>();

    public Set<String> getTranslators() {
        return translators;
    }

    public void setTranslators(Set<String> translators) {
        this.translators = translators;
    }

    public Set<String> getVdbs() {
        return vdbs;
    }

    public void setVdbs(Set<String> vdbs) {
        this.vdbs = vdbs;
    }

    public Set<String> getDdls() {
        return ddls;
    }

    public void setDdls(Set<String> ddls) {
        this.ddls = ddls;
    }

   
}
