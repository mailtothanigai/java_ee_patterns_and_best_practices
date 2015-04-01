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

* Copyright (c) 18. August 2009 Adam Bien, blog.adam-bien.com
* http://press.adam-bien.com
*/
package com.abien.patterns.business.order.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author adam-bien.com
 */
@Entity
public abstract class OrderItem {

    @Id
    @GeneratedValue
    private Long id;
    
    private int weight;

    public OrderItem() {

    }
    public OrderItem(int weight) {
        this.weight = weight;
    }

    protected int getWeight() {
        return weight;
    }

    public int getShippingCost(){
        return this.weight*5;
    }

    public Long getId() {
        return id;
    }
}
