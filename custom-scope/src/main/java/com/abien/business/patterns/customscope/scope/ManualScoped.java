/**
This file is part of javaee-patterns.

javaee-patterns is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

javaee-patterns is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.opensource.org/licenses/gpl-2.0.php>.

* Copyright (c) 23.07.2012, Adam Bien, adam-bien.com
* http://press.adam-bien.com
*/
package com.abien.business.patterns.customscope.scope;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.enterprise.context.NormalScope;

/**
 *
 * @author Adam Bien, blog.adam-bien.com
 */
@Inherited
@NormalScope
@Retention(RUNTIME)
@Target({METHOD, FIELD, TYPE})
public @interface ManualScoped {
}