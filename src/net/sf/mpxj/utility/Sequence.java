/*
 * file:       Sequence.java
 * author:     Jon Iles
 * copyright:  (c) Packwood Software Limited 2006
 * date:       May 22, 2007
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

package net.sf.mpxj.utility;

/**
 * Trivial class implementing sequence generation.
 */
public class Sequence
{
   /**
    * Constructor. Defines the starting value of the seqence.
    * 
    * @param initialValue initial sequence value
    */
   public Sequence (int initialValue)
   {
      m_sequence = initialValue;
   }
   
   /**
    * Retrieve the next value in the sequence.
    * 
    * @return next sequence value
    */
   public int next ()
   {
      return (m_sequence++);
   }
   
   private int m_sequence;
}
