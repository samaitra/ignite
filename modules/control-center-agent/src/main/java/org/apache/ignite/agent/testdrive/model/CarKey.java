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
 * CarKey definition.
 *
 * Code generated by Apache Ignite Schema Import utility: 08/24/2015.
 */
public class CarKey implements Serializable {
    /** */
    private static final long serialVersionUID = 0L;

    /** Value for carId. */
    private int carId;

    /**
     * Empty constructor.
     */
    public CarKey() {
        // No-op.
    }

    /**
     * Full constructor.
     */
    public CarKey(
        int carId
    ) {
        this.carId = carId;
    }

    /**
     * Gets carId.
     *
     * @return Value for carId.
     */
    public int getCarId() {
        return carId;
    }

    /**
     * Sets carId.
     *
     * @param carId New value for carId.
     */
    public void setCarId(int carId) {
        this.carId = carId;
    }

    /** {@inheritDoc} */
    @Override public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof CarKey))
            return false;

        CarKey that = (CarKey)o;

        if (carId != that.carId)
            return false;

        return true;
    }

    /** {@inheritDoc} */
    @Override public int hashCode() {
        int res = carId;

        return res;
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return "CarKey [carId=" + carId +
            "]";
    }
}

