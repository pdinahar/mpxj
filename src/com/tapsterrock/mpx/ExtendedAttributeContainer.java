/*
 * file:       ExtendedAttributeContainer.java
 * author:     Jon Iles
 * copyright:  (c) Tapster Rock Limited 2005
 * date:       Mar 30, 2005
 */
 
/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

package com.tapsterrock.mpx;

import java.util.Date;

/**
 * This interface is implemnted by the Task and Resource classes. It
 * defines the common methods used to set extended attributes.
 */
public interface ExtendedAttributeContainer
{
   /**
    * This method is used to set the value of a field.
    *
    * @param field field to be added or updated.
    * @param val new value for field.
    */
   public void set (int field, Object val);

   /**
    * This method is used to set the value of a date field.
    * 
    * @param field field to be added or updated.
    * @param val new value for field.
    */
   public void setDate (int field, Date val);


   /**
    * This method is used to set the value of a currency field.
    *
    * @param field field to be added or updated.
    * @param val new value for field.
    */
   public void setCurrency (int field, Number val);
}