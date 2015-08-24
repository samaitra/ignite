/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.agent.testdrive.model;

import java.io.*;

/**
 * Department definition.
 *
 * Code generated by Apache Ignite Schema Import utility: 08/24/2015.
 */
public class Department implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for departmentId. */
    private int departmentId;

    /** Value for departmentName. */
    private String departmentName;

    /** Value for countryId. */
    private Integer countryId;

    /** Value for managerId. */
    private Integer managerId;

    /**
     * Empty constructor.
     */
    public Department() {
        // No-op.
    }

    /**
     * Full constructor.
     */
    public Department(
        int departmentId,
        String departmentName,
        Integer countryId,
        Integer managerId
    ) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.countryId = countryId;
        this.managerId = managerId;
    }

    /**
     * Gets departmentId.
     *
     * @return Value for departmentId.
     */
    public int getDepartmentId() {
        return departmentId;
    }

    /**
     * Sets departmentId.
     *
     * @param departmentId New value for departmentId.
     */
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * Gets departmentName.
     *
     * @return Value for departmentName.
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets departmentName.
     *
     * @param departmentName New value for departmentName.
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * Gets countryId.
     *
     * @return Value for countryId.
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * Sets countryId.
     *
     * @param countryId New value for countryId.
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * Gets managerId.
     *
     * @return Value for managerId.
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * Sets managerId.
     *
     * @param managerId New value for managerId.
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /** {@inheritDoc} */
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof Department))
            return false;

        Department that = (Department)o;

        if (departmentId != that.departmentId)
            return false;

        if (departmentName != null ? !departmentName.equals(that.departmentName) : that.departmentName != null)
            return false;

        if (countryId != null ? !countryId.equals(that.countryId) : that.countryId != null)
            return false;

        if (managerId != null ? !managerId.equals(that.managerId) : that.managerId != null)
            return false;

        return true;
    }

    /** {@inheritDoc} */
    @Override public int hashCode() {
        int res = departmentId;

        res = 31 * res + (departmentName != null ? departmentName.hashCode() : 0);

        res = 31 * res + (countryId != null ? countryId.hashCode() : 0);

        res = 31 * res + (managerId != null ? managerId.hashCode() : 0);

        return res;
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return "Department [departmentId=" + departmentId +
            ", departmentName=" + departmentName +
            ", countryId=" + countryId +
            ", managerId=" + managerId +
            "]";
    }
}

