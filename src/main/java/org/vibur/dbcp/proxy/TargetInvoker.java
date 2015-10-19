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

package org.vibur.dbcp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Simeon Malchev
 */
public interface TargetInvoker extends InvocationHandler {

    /**
     * Dispatches the method call to the real underlying (proxied) object.
     *
     * @param method the invoked method
     * @param args the method arguments
     * @return the result of the method invocation
     * @throws Throwable if the underlying method call throws a Throwable
     */
    Object targetInvoke(Method method, Object[] args) throws Throwable;
}
