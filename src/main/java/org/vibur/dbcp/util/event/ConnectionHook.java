/**
 * Copyright 2015 Simeon Malchev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.vibur.dbcp.util.event;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * An application programming hook for JDBC Connection tune-up.
 *
 * @see org.vibur.dbcp.ViburDBCPConfig#initConnectionHook
 * @see org.vibur.dbcp.ViburDBCPConfig#connectionHook
 * @see org.vibur.dbcp.ViburDBCPConfig#closeConnectionHook
 *
 * @author Simeon Malchev
 */
public interface ConnectionHook {

    /**
     * An application hook which will be called at a specific point of the JDBC Connection lifecycle. The invocation
     * of this method will typically happen when a particular method of the {@link javax.sql.DataSource} or
     * {@link Connection} interface has been called by the application, and should take as short time as possible.
     *
     * <p>This application hook serves as an extension point to the internal workings of the connection pool and has
     * access to the <b>raw (original)</b> JDBC Connection object, not the proxied such. In order to avoid interfering
     * with how the connection pool manages its underlying connections, the application <b>must not</b> keep or store
     * in one or another form a reference to the {@code rawConnection} object.
     *
     * @param rawConnection a retrieved from the pool raw JDBC connection
     * @throws SQLException if any operation executed on the raw JDBC Connection throws an SQLException
     */
    void on(Connection rawConnection) throws SQLException;
}