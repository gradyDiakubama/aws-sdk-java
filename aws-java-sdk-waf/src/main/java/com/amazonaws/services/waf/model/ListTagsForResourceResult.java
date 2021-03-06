/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListTagsForResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String nextMarker;

    private TagInfoForResource tagInfoForResource;

    /**
     * @param nextMarker
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * @return
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @param nextMarker
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * @param tagInfoForResource
     */

    public void setTagInfoForResource(TagInfoForResource tagInfoForResource) {
        this.tagInfoForResource = tagInfoForResource;
    }

    /**
     * @return
     */

    public TagInfoForResource getTagInfoForResource() {
        return this.tagInfoForResource;
    }

    /**
     * @param tagInfoForResource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withTagInfoForResource(TagInfoForResource tagInfoForResource) {
        setTagInfoForResource(tagInfoForResource);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getTagInfoForResource() != null)
            sb.append("TagInfoForResource: ").append(getTagInfoForResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceResult == false)
            return false;
        ListTagsForResourceResult other = (ListTagsForResourceResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getTagInfoForResource() == null ^ this.getTagInfoForResource() == null)
            return false;
        if (other.getTagInfoForResource() != null && other.getTagInfoForResource().equals(this.getTagInfoForResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getTagInfoForResource() == null) ? 0 : getTagInfoForResource().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceResult clone() {
        try {
            return (ListTagsForResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
