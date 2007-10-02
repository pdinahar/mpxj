/*
 * file:       TaskField.java
 * author:     Jon Iles
 * copyright:  (c) Packwood Software Limited 2005
 * date:       16/04/2005
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

package net.sf.mpxj;

import java.util.Locale;



/**
 * Instances of this type represent Task fields.
 */
public final class TaskField implements FieldType
{
   /**
    * Private constructor.
    *
    * @param value task field value
    * @param dataType data type
    */
   private TaskField (int value, DataType dataType)
   {
      m_value = value;
      m_dataType = dataType;
   }

   /**
    * {@inheritDoc}
    */
   public String getName()
   {
      return (getName(Locale.ENGLISH));
   }

   /**
    * {@inheritDoc}
    */
   public String getName (Locale locale)
   {
      String[] titles = LocaleData.getStringArray(locale, LocaleData.TASK_COLUMNS);
      String result = null;

      if (m_value >= 0 && m_value < titles.length)
      {
         result = titles[m_value];
      }

      return (result);
   }

   /**
    * {@inheritDoc}
    */
   public int getValue ()
   {
      return (m_value);
   }

   /**
    * {@inheritDoc}
    */
   public DataType getDataType ()
   {
      return (m_dataType);
   }
   
   /**
    * Retrieves the string representation of this instance.
    *
    * @return string representation
    */
   @Override public String toString ()
   {
      return (getName());
   }

   /**
    * {@inheritDoc}
    */
   @Override public boolean equals (Object obj)
   {
      boolean result = false;
      if (obj instanceof TaskField)
      {
         result = (m_value == ((TaskField)obj).m_value);
      }
      return (result);
   }
   
   /**
    * {@inheritDoc}
    */
   @Override public int hashCode ()
   {
      return (m_value);
   }
   
   /**
    * This method takes the integer enumeration of a task field
    * and returns an appropriate class instance.
    *
    * @param type integer task field enumeration
    * @return TaskField instance
    */   
   public static TaskField getInstance (int type) 
   {
      TaskField result = null;
      
      if (type >= 0 && type < MAX_VALUE)
      {
         result = TYPE_VALUES[type];
      }
      
      return (result);
  }

   public static final int WORK_VALUE = 0;
   public static final int BASELINE_WORK_VALUE = 1;
   public static final int ACTUAL_WORK_VALUE = 2;
   public static final int WORK_VARIANCE_VALUE = 3;
   public static final int REMAINING_WORK_VALUE = 4;
   public static final int COST_VALUE = 5;
   public static final int BASELINE_COST_VALUE = 6;
   public static final int ACTUAL_COST_VALUE = 7;
   public static final int FIXED_COST_VALUE = 8;
   public static final int COST_VARIANCE_VALUE = 9;
   public static final int REMAINING_COST_VALUE = 10;
   public static final int BCWP_VALUE = 11;
   public static final int BCWS_VALUE = 12;
   public static final int SV_VALUE = 13;
   public static final int NAME_VALUE = 14;
   public static final int WBS_VALUE = 15;
   public static final int CONSTRAINT_TYPE_VALUE = 16;
   public static final int CONSTRAINT_DATE_VALUE = 17;
   public static final int CRITICAL_VALUE = 18;
   public static final int LEVELING_DELAY_VALUE = 19;
   public static final int FREE_SLACK_VALUE = 20;
   public static final int TOTAL_SLACK_VALUE = 21;
   public static final int ID_VALUE = 22;
   public static final int MILESTONE_VALUE = 23;
   public static final int PRIORITY_VALUE = 24;
   public static final int SUBPROJECT_FILE_VALUE = 25;
   public static final int BASELINE_DURATION_VALUE = 26;
   public static final int ACTUAL_DURATION_VALUE = 27;
   public static final int DURATION_VALUE = 28;
   public static final int DURATION_VARIANCE_VALUE = 29;
   public static final int REMAINING_DURATION_VALUE = 30;
   public static final int PERCENT_COMPLETE_VALUE = 31;
   public static final int PERCENT_WORK_COMPLETE_VALUE = 32;
   public static final int START_VALUE = 33;
   public static final int FINISH_VALUE = 34;
   public static final int EARLY_START_VALUE = 35;
   public static final int EARLY_FINISH_VALUE = 36;
   public static final int LATE_START_VALUE = 37;
   public static final int LATE_FINISH_VALUE = 38;
   public static final int ACTUAL_START_VALUE = 39;
   public static final int ACTUAL_FINISH_VALUE = 40;
   public static final int BASELINE_START_VALUE = 41;
   public static final int BASELINE_FINISH_VALUE = 42;
   public static final int START_VARIANCE_VALUE = 43;
   public static final int FINISH_VARIANCE_VALUE = 44;
   public static final int PREDECESSORS_VALUE = 45;
   public static final int SUCCESSORS_VALUE = 46;
   public static final int RESOURCE_NAMES_VALUE = 47;
   public static final int RESOURCE_INITIALS_VALUE = 48;
   public static final int TEXT1_VALUE = 49;
   public static final int START1_VALUE = 50;
   public static final int FINISH1_VALUE = 51;
   public static final int TEXT2_VALUE = 52;
   public static final int START2_VALUE = 53;
   public static final int FINISH2_VALUE = 54;
   public static final int TEXT3_VALUE = 55;
   public static final int START3_VALUE = 56;
   public static final int FINISH3_VALUE = 57;
   public static final int TEXT4_VALUE = 58;
   public static final int START4_VALUE = 59;
   public static final int FINISH4_VALUE = 60;
   public static final int TEXT5_VALUE = 61;
   public static final int START5_VALUE = 62;
   public static final int FINISH5_VALUE = 63;
   public static final int TEXT6_VALUE = 64;
   public static final int TEXT7_VALUE = 65;
   public static final int TEXT8_VALUE = 66;
   public static final int TEXT9_VALUE = 67;
   public static final int TEXT10_VALUE = 68;
   public static final int MARKED_VALUE = 69;
   public static final int FLAG1_VALUE = 70;
   public static final int FLAG2_VALUE = 71;
   public static final int FLAG3_VALUE = 72;
   public static final int FLAG4_VALUE = 73;
   public static final int FLAG5_VALUE = 74;
   public static final int FLAG6_VALUE = 75;
   public static final int FLAG7_VALUE = 76;
   public static final int FLAG8_VALUE = 77;
   public static final int FLAG9_VALUE = 78;
   public static final int FLAG10_VALUE = 79;
   public static final int ROLLUP_VALUE = 80;
   public static final int CV_VALUE = 81;
   public static final int PROJECT_VALUE = 82;
   public static final int OUTLINE_LEVEL_VALUE = 83;
   public static final int UNIQUE_ID_VALUE = 84;
   public static final int NUMBER1_VALUE = 85;
   public static final int NUMBER2_VALUE = 86;
   public static final int NUMBER3_VALUE = 87;
   public static final int NUMBER4_VALUE = 88;
   public static final int NUMBER5_VALUE = 89;
   public static final int SUMMARY_VALUE = 90;
   public static final int CREATED_VALUE = 91;
   public static final int NOTES_VALUE = 92;
   public static final int UNIQUE_ID_PREDECESSORS_VALUE = 93;
   public static final int UNIQUE_ID_SUCCESSORS_VALUE = 94;
   public static final int OBJECTS_VALUE = 95;
   public static final int LINKED_FIELDS_VALUE = 96;
   public static final int RESUME_VALUE = 97;
   public static final int STOP_VALUE = 98;
   public static final int OUTLINE_NUMBER_VALUE = 99;
   public static final int DURATION1_VALUE = 100;
   public static final int DURATION2_VALUE = 101;
   public static final int DURATION3_VALUE = 102;
   public static final int COST1_VALUE = 103;
   public static final int COST2_VALUE = 104;
   public static final int COST3_VALUE = 105;
   public static final int HIDEBAR_VALUE = 106;
   public static final int CONFIRMED_VALUE = 107;
   public static final int UPDATE_NEEDED_VALUE = 108;
   public static final int CONTACT_VALUE = 109;
   public static final int RESOURCE_GROUP_VALUE = 110;
   public static final int ACWP_VALUE = 111;
   public static final int TYPE_VALUE = 112;
   public static final int RECURRING_VALUE = 113;
   public static final int EFFORT_DRIVEN_VALUE = 114;
   public static final int OVERTIME_WORK_VALUE = 115;
   public static final int ACTUAL_OVERTIME_WORK_VALUE = 116;
   public static final int REMAINING_OVERTIME_WORK_VALUE = 117;
   public static final int REGULAR_WORK_VALUE = 118;
   public static final int OVERTIME_COST_VALUE = 119;
   public static final int ACTUAL_OVERTIME_COST_VALUE = 120;
   public static final int REMAINING_OVERTIME_COST_VALUE = 121;
   public static final int FIXED_COST_ACCRUAL_VALUE = 122;
   public static final int INDICATORS_VALUE = 123;
   public static final int HYPERLINK_VALUE = 124;
   public static final int HYPERLINK_ADDRESS_VALUE = 125;
   public static final int HYPERLINK_SUBADDRESS_VALUE = 126;
   public static final int HYPERLINK_HREF_VALUE = 127;
   public static final int ASSIGNMENT_VALUE = 128;
   public static final int OVERALLOCATED_VALUE = 129;
   public static final int EXTERNAL_TASK_VALUE = 130;
   public static final int SUBPROJECT_READ_ONLY_VALUE = 131;
   public static final int RESPONSE_PENDING_VALUE = 132;
   public static final int TEAMSTATUS_PENDING_VALUE = 133;
   public static final int LEVELING_CAN_SPLIT_VALUE = 134;
   public static final int LEVEL_ASSIGNMENTS_VALUE = 135;
   public static final int WORK_CONTOUR_VALUE = 136;
   public static final int COST4_VALUE = 137;
   public static final int COST5_VALUE = 138;
   public static final int COST6_VALUE = 139;
   public static final int COST7_VALUE = 140;
   public static final int COST8_VALUE = 141;
   public static final int COST9_VALUE = 142;
   public static final int COST10_VALUE = 143;
   public static final int DATE1_VALUE = 144;
   public static final int DATE2_VALUE = 145;
   public static final int DATE3_VALUE = 146;
   public static final int DATE4_VALUE = 147;
   public static final int DATE5_VALUE = 148;
   public static final int DATE6_VALUE = 149;
   public static final int DATE7_VALUE = 150;
   public static final int DATE8_VALUE = 151;
   public static final int DATE9_VALUE = 152;
   public static final int DATE10_VALUE = 153;
   public static final int DURATION4_VALUE = 154;
   public static final int DURATION5_VALUE = 155;
   public static final int DURATION6_VALUE = 156;
   public static final int DURATION7_VALUE = 157;
   public static final int DURATION8_VALUE = 158;
   public static final int DURATION9_VALUE = 159;
   public static final int DURATION10_VALUE = 160;
   public static final int START6_VALUE = 161;
   public static final int FINISH6_VALUE = 162;
   public static final int START7_VALUE = 163;
   public static final int FINISH7_VALUE = 164;
   public static final int START8_VALUE = 165;
   public static final int FINISH8_VALUE = 166;
   public static final int START9_VALUE = 167;
   public static final int FINISH9_VALUE = 168;
   public static final int START10_VALUE = 169;
   public static final int FINISH10_VALUE = 170;
   public static final int FLAG11_VALUE = 171;
   public static final int FLAG12_VALUE = 172;
   public static final int FLAG13_VALUE = 173;
   public static final int FLAG14_VALUE = 174;
   public static final int FLAG15_VALUE = 175;
   public static final int FLAG16_VALUE = 176;
   public static final int FLAG17_VALUE = 177;
   public static final int FLAG18_VALUE = 178;
   public static final int FLAG19_VALUE = 179;
   public static final int FLAG20_VALUE = 180;
   public static final int NUMBER6_VALUE = 181;
   public static final int NUMBER7_VALUE = 182;
   public static final int NUMBER8_VALUE = 183;
   public static final int NUMBER9_VALUE = 184;
   public static final int NUMBER10_VALUE = 185;
   public static final int NUMBER11_VALUE = 186;
   public static final int NUMBER12_VALUE = 187;
   public static final int NUMBER13_VALUE = 188;
   public static final int NUMBER14_VALUE = 189;
   public static final int NUMBER15_VALUE = 190;
   public static final int NUMBER16_VALUE = 191;
   public static final int NUMBER17_VALUE = 192;
   public static final int NUMBER18_VALUE = 193;
   public static final int NUMBER19_VALUE = 194;
   public static final int NUMBER20_VALUE = 195;
   public static final int TEXT11_VALUE = 196;
   public static final int TEXT12_VALUE = 197;
   public static final int TEXT13_VALUE = 198;
   public static final int TEXT14_VALUE = 199;
   public static final int TEXT15_VALUE = 200;
   public static final int TEXT16_VALUE = 201;
   public static final int TEXT17_VALUE = 202;
   public static final int TEXT18_VALUE = 203;
   public static final int TEXT19_VALUE = 204;
   public static final int TEXT20_VALUE = 205;
   public static final int TEXT21_VALUE = 206;
   public static final int TEXT22_VALUE = 207;
   public static final int TEXT23_VALUE = 208;
   public static final int TEXT24_VALUE = 209;
   public static final int TEXT25_VALUE = 210;
   public static final int TEXT26_VALUE = 211;
   public static final int TEXT27_VALUE = 212;
   public static final int TEXT28_VALUE = 213;
   public static final int TEXT29_VALUE = 214;
   public static final int TEXT30_VALUE = 215;
   public static final int RESOURCE_PHONETICS_VALUE = 216;
   public static final int ASSIGNMENT_DELAY_VALUE = 217;
   public static final int ASSIGNMENT_UNITS_VALUE = 218;
   public static final int COST_RATE_TABLE_VALUE = 219;
   public static final int PRELEVELED_START_VALUE = 220;
   public static final int PRELEVELED_FINISH_VALUE = 221;
   public static final int ESTIMATED_VALUE = 222;
   public static final int IGNORE_RESOURCE_CALENDAR_VALUE = 223;
   public static final int CALENDAR_VALUE = 224;
   public static final int OUTLINE_CODE1_VALUE = 225;
   public static final int OUTLINE_CODE2_VALUE = 226;
   public static final int OUTLINE_CODE3_VALUE = 227;
   public static final int OUTLINE_CODE4_VALUE = 228;
   public static final int OUTLINE_CODE5_VALUE = 229;
   public static final int OUTLINE_CODE6_VALUE = 230;
   public static final int OUTLINE_CODE7_VALUE = 231;
   public static final int OUTLINE_CODE8_VALUE = 232;
   public static final int OUTLINE_CODE9_VALUE = 233;
   public static final int OUTLINE_CODE10_VALUE = 234;
   public static final int DEADLINE_VALUE = 235;
   public static final int START_SLACK_VALUE = 236;
   public static final int FINISH_SLACK_VALUE = 237;
   public static final int VAC_VALUE = 238;
   public static final int GROUP_BY_SUMMARY_VALUE = 239;
   public static final int WBS_PREDECESSORS_VALUE = 240;
   public static final int WBS_SUCCESSORS_VALUE = 241;
   public static final int RESOURCE_TYPE_VALUE = 242;

   public static final int MAX_VALUE = 243;
   
   public static final TaskField WORK = new TaskField(WORK_VALUE, DataType.DURATION);
   public static final TaskField BASELINE_WORK = new TaskField(BASELINE_WORK_VALUE, DataType.DURATION);
   public static final TaskField ACTUAL_WORK = new TaskField(ACTUAL_WORK_VALUE, DataType.DURATION);
   public static final TaskField WORK_VARIANCE = new TaskField(WORK_VARIANCE_VALUE, DataType.DURATION);
   public static final TaskField REMAINING_WORK = new TaskField(REMAINING_WORK_VALUE, DataType.DURATION);
   public static final TaskField COST = new TaskField(COST_VALUE, DataType.CURRENCY);
   public static final TaskField BASELINE_COST = new TaskField(BASELINE_COST_VALUE, DataType.CURRENCY);
   public static final TaskField ACTUAL_COST = new TaskField(ACTUAL_COST_VALUE, DataType.CURRENCY);
   public static final TaskField FIXED_COST = new TaskField(FIXED_COST_VALUE, DataType.CURRENCY);
   public static final TaskField COST_VARIANCE = new TaskField(COST_VARIANCE_VALUE, DataType.CURRENCY);
   public static final TaskField REMAINING_COST = new TaskField(REMAINING_COST_VALUE, DataType.CURRENCY);
   public static final TaskField BCWP = new TaskField(BCWP_VALUE, DataType.CURRENCY);
   public static final TaskField BCWS = new TaskField(BCWS_VALUE, DataType.CURRENCY);
   public static final TaskField SV = new TaskField(SV_VALUE, DataType.CURRENCY);
   public static final TaskField NAME = new TaskField(NAME_VALUE, DataType.STRING);
   public static final TaskField WBS = new TaskField(WBS_VALUE, DataType.STRING);
   public static final TaskField CONSTRAINT_TYPE = new TaskField(CONSTRAINT_TYPE_VALUE, DataType.CONSTRAINT);
   public static final TaskField CONSTRAINT_DATE = new TaskField(CONSTRAINT_DATE_VALUE, DataType.DATE);
   public static final TaskField CRITICAL = new TaskField(CRITICAL_VALUE, DataType.BOOLEAN);
   public static final TaskField LEVELING_DELAY = new TaskField(LEVELING_DELAY_VALUE, DataType.DURATION);
   public static final TaskField FREE_SLACK = new TaskField(FREE_SLACK_VALUE, DataType.DURATION);
   public static final TaskField TOTAL_SLACK = new TaskField(TOTAL_SLACK_VALUE, DataType.DURATION);
   public static final TaskField ID = new TaskField(ID_VALUE, DataType.BOOLEAN);
   public static final TaskField MILESTONE = new TaskField(MILESTONE_VALUE, DataType.BOOLEAN);
   public static final TaskField PRIORITY = new TaskField(PRIORITY_VALUE, DataType.PRIORITY);
   public static final TaskField SUBPROJECT_FILE = new TaskField(SUBPROJECT_FILE_VALUE, DataType.STRING);
   public static final TaskField BASELINE_DURATION = new TaskField(BASELINE_DURATION_VALUE, DataType.DURATION);
   public static final TaskField ACTUAL_DURATION = new TaskField(ACTUAL_DURATION_VALUE, DataType.DURATION);
   public static final TaskField DURATION = new TaskField(DURATION_VALUE, DataType.DURATION);
   public static final TaskField DURATION_VARIANCE = new TaskField(DURATION_VARIANCE_VALUE, DataType.DURATION);
   public static final TaskField REMAINING_DURATION = new TaskField(REMAINING_DURATION_VALUE, DataType.DURATION);
   public static final TaskField PERCENT_COMPLETE = new TaskField(PERCENT_COMPLETE_VALUE, DataType.PERCENTAGE);
   public static final TaskField PERCENT_WORK_COMPLETE = new TaskField(PERCENT_WORK_COMPLETE_VALUE, DataType.PERCENTAGE);
   public static final TaskField START = new TaskField(START_VALUE, DataType.DATE);
   public static final TaskField FINISH = new TaskField(FINISH_VALUE, DataType.DATE);
   public static final TaskField EARLY_START = new TaskField(EARLY_START_VALUE, DataType.DATE);
   public static final TaskField EARLY_FINISH = new TaskField(EARLY_FINISH_VALUE, DataType.DATE);
   public static final TaskField LATE_START = new TaskField(LATE_START_VALUE, DataType.DATE);
   public static final TaskField LATE_FINISH = new TaskField(LATE_FINISH_VALUE, DataType.DATE);
   public static final TaskField ACTUAL_START = new TaskField(ACTUAL_START_VALUE, DataType.DATE);
   public static final TaskField ACTUAL_FINISH = new TaskField(ACTUAL_FINISH_VALUE, DataType.DATE);
   public static final TaskField BASELINE_START = new TaskField(BASELINE_START_VALUE, DataType.DATE);
   public static final TaskField BASELINE_FINISH = new TaskField(BASELINE_FINISH_VALUE, DataType.DATE);
   public static final TaskField START_VARIANCE = new TaskField(START_VARIANCE_VALUE, DataType.DURATION);
   public static final TaskField FINISH_VARIANCE = new TaskField(FINISH_VARIANCE_VALUE, DataType.DURATION);
   public static final TaskField PREDECESSORS = new TaskField(PREDECESSORS_VALUE, DataType.RELATION_LIST);
   public static final TaskField SUCCESSORS = new TaskField(SUCCESSORS_VALUE, DataType.RELATION_LIST);
   public static final TaskField RESOURCE_NAMES = new TaskField(RESOURCE_NAMES_VALUE, DataType.STRING);
   public static final TaskField RESOURCE_INITIALS = new TaskField(RESOURCE_INITIALS_VALUE, DataType.STRING);
   public static final TaskField TEXT1 = new TaskField(TEXT1_VALUE, DataType.STRING);
   public static final TaskField START1 = new TaskField(START1_VALUE, DataType.DATE);
   public static final TaskField FINISH1 = new TaskField(FINISH1_VALUE, DataType.DATE);
   public static final TaskField TEXT2 = new TaskField(TEXT2_VALUE, DataType.STRING);
   public static final TaskField START2 = new TaskField(START2_VALUE, DataType.DATE);
   public static final TaskField FINISH2 = new TaskField(FINISH2_VALUE, DataType.DATE);
   public static final TaskField TEXT3 = new TaskField(TEXT3_VALUE, DataType.STRING);
   public static final TaskField START3 = new TaskField(START3_VALUE, DataType.DATE);
   public static final TaskField FINISH3 = new TaskField(FINISH3_VALUE, DataType.DATE);
   public static final TaskField TEXT4 = new TaskField(TEXT4_VALUE, DataType.STRING);
   public static final TaskField START4 = new TaskField(START4_VALUE, DataType.DATE);
   public static final TaskField FINISH4 = new TaskField(FINISH4_VALUE, DataType.DATE);
   public static final TaskField TEXT5 = new TaskField(TEXT5_VALUE, DataType.STRING);
   public static final TaskField START5 = new TaskField(START5_VALUE, DataType.DATE);
   public static final TaskField FINISH5 = new TaskField(FINISH5_VALUE, DataType.DATE);
   public static final TaskField TEXT6 = new TaskField(TEXT6_VALUE, DataType.STRING);
   public static final TaskField TEXT7 = new TaskField(TEXT7_VALUE, DataType.STRING);
   public static final TaskField TEXT8 = new TaskField(TEXT8_VALUE, DataType.STRING);
   public static final TaskField TEXT9 = new TaskField(TEXT9_VALUE, DataType.STRING);
   public static final TaskField TEXT10 = new TaskField(TEXT10_VALUE, DataType.STRING);
   public static final TaskField MARKED = new TaskField(MARKED_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG1 = new TaskField(FLAG1_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG2 = new TaskField(FLAG2_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG3 = new TaskField(FLAG3_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG4 = new TaskField(FLAG4_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG5 = new TaskField(FLAG5_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG6 = new TaskField(FLAG6_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG7 = new TaskField(FLAG7_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG8 = new TaskField(FLAG8_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG9 = new TaskField(FLAG9_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG10 = new TaskField(FLAG10_VALUE, DataType.BOOLEAN);
   public static final TaskField ROLLUP = new TaskField(ROLLUP_VALUE, DataType.BOOLEAN);
   public static final TaskField CV = new TaskField(CV_VALUE, DataType.NUMERIC);
   public static final TaskField PROJECT = new TaskField(PROJECT_VALUE, DataType.STRING);
   public static final TaskField OUTLINE_LEVEL = new TaskField(OUTLINE_LEVEL_VALUE, DataType.NUMERIC);
   public static final TaskField UNIQUE_ID = new TaskField(UNIQUE_ID_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER1 = new TaskField(NUMBER1_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER2 = new TaskField(NUMBER2_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER3 = new TaskField(NUMBER3_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER4 = new TaskField(NUMBER4_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER5 = new TaskField(NUMBER5_VALUE, DataType.NUMERIC);
   public static final TaskField SUMMARY = new TaskField(SUMMARY_VALUE, DataType.BOOLEAN);
   public static final TaskField CREATED = new TaskField(CREATED_VALUE, DataType.DATE);
   public static final TaskField NOTES = new TaskField(NOTES_VALUE, DataType.STRING);
   public static final TaskField UNIQUE_ID_PREDECESSORS = new TaskField(UNIQUE_ID_PREDECESSORS_VALUE, DataType.RELATION_LIST);
   public static final TaskField UNIQUE_ID_SUCCESSORS = new TaskField(UNIQUE_ID_SUCCESSORS_VALUE, DataType.RELATION_LIST);
   public static final TaskField OBJECTS = new TaskField(OBJECTS_VALUE, DataType.NUMERIC);
   public static final TaskField LINKED_FIELDS = new TaskField(LINKED_FIELDS_VALUE, DataType.BOOLEAN);
   public static final TaskField RESUME = new TaskField(RESUME_VALUE, DataType.DATE);
   public static final TaskField STOP = new TaskField(STOP_VALUE, DataType.DATE);
   public static final TaskField OUTLINE_NUMBER = new TaskField(OUTLINE_NUMBER_VALUE, DataType.STRING);
   public static final TaskField DURATION1 = new TaskField(DURATION1_VALUE, DataType.DURATION);
   public static final TaskField DURATION2 = new TaskField(DURATION2_VALUE, DataType.DURATION);
   public static final TaskField DURATION3 = new TaskField(DURATION3_VALUE, DataType.DURATION);
   public static final TaskField COST1 = new TaskField(COST1_VALUE, DataType.CURRENCY);
   public static final TaskField COST2 = new TaskField(COST2_VALUE, DataType.CURRENCY);
   public static final TaskField COST3 = new TaskField(COST3_VALUE, DataType.CURRENCY);
   public static final TaskField HIDEBAR = new TaskField(HIDEBAR_VALUE, DataType.BOOLEAN);
   public static final TaskField CONFIRMED = new TaskField(CONFIRMED_VALUE, DataType.BOOLEAN);
   public static final TaskField UPDATE_NEEDED = new TaskField(UPDATE_NEEDED_VALUE, DataType.BOOLEAN);
   public static final TaskField CONTACT = new TaskField(CONTACT_VALUE, DataType.STRING);
   public static final TaskField RESOURCE_GROUP = new TaskField(RESOURCE_GROUP_VALUE, DataType.STRING);
   public static final TaskField ACWP = new TaskField(ACWP_VALUE, DataType.NUMERIC);
   public static final TaskField TYPE = new TaskField(TYPE_VALUE, DataType.TASK_TYPE);
   public static final TaskField RECURRING = new TaskField(RECURRING_VALUE, DataType.BOOLEAN);
   public static final TaskField EFFORT_DRIVEN = new TaskField(EFFORT_DRIVEN_VALUE, DataType.BOOLEAN);
   public static final TaskField OVERTIME_WORK = new TaskField(OVERTIME_WORK_VALUE, DataType.DURATION);
   public static final TaskField ACTUAL_OVERTIME_WORK = new TaskField(ACTUAL_OVERTIME_WORK_VALUE, DataType.DURATION);
   public static final TaskField REMAINING_OVERTIME_WORK = new TaskField(REMAINING_OVERTIME_WORK_VALUE, DataType.DURATION);
   public static final TaskField REGULAR_WORK = new TaskField(REGULAR_WORK_VALUE, DataType.DURATION);
   public static final TaskField OVERTIME_COST = new TaskField(OVERTIME_COST_VALUE, DataType.CURRENCY);
   public static final TaskField ACTUAL_OVERTIME_COST = new TaskField(ACTUAL_OVERTIME_COST_VALUE, DataType.CURRENCY);
   public static final TaskField REMAINING_OVERTIME_COST = new TaskField(REMAINING_OVERTIME_COST_VALUE, DataType.CURRENCY);
   public static final TaskField FIXED_COST_ACCRUAL = new TaskField(FIXED_COST_ACCRUAL_VALUE, DataType.ACCRUE);
   public static final TaskField INDICATORS = new TaskField(INDICATORS_VALUE, DataType.STRING);
   public static final TaskField HYPERLINK = new TaskField(HYPERLINK_VALUE, DataType.STRING);
   public static final TaskField HYPERLINK_ADDRESS = new TaskField(HYPERLINK_ADDRESS_VALUE, DataType.STRING);
   public static final TaskField HYPERLINK_SUBADDRESS = new TaskField(HYPERLINK_SUBADDRESS_VALUE, DataType.STRING);
   public static final TaskField HYPERLINK_HREF = new TaskField(HYPERLINK_HREF_VALUE, DataType.STRING);
   public static final TaskField ASSIGNMENT = new TaskField(ASSIGNMENT_VALUE, DataType.STRING);
   public static final TaskField OVERALLOCATED = new TaskField(OVERALLOCATED_VALUE, DataType.BOOLEAN);
   public static final TaskField EXTERNAL_TASK = new TaskField(EXTERNAL_TASK_VALUE, DataType.BOOLEAN);
   public static final TaskField SUBPROJECT_READ_ONLY = new TaskField(SUBPROJECT_READ_ONLY_VALUE, DataType.BOOLEAN);
   public static final TaskField RESPONSE_PENDING = new TaskField(RESPONSE_PENDING_VALUE, DataType.BOOLEAN);
   public static final TaskField TEAMSTATUS_PENDING = new TaskField(TEAMSTATUS_PENDING_VALUE, DataType.BOOLEAN);
   public static final TaskField LEVELING_CAN_SPLIT = new TaskField(LEVELING_CAN_SPLIT_VALUE, DataType.BOOLEAN);
   public static final TaskField LEVEL_ASSIGNMENTS = new TaskField(LEVEL_ASSIGNMENTS_VALUE, DataType.BOOLEAN);
   public static final TaskField WORK_CONTOUR = new TaskField(WORK_CONTOUR_VALUE, DataType.STRING);
   public static final TaskField COST4 = new TaskField(COST4_VALUE, DataType.CURRENCY);
   public static final TaskField COST5 = new TaskField(COST5_VALUE, DataType.CURRENCY);
   public static final TaskField COST6 = new TaskField(COST6_VALUE, DataType.CURRENCY);
   public static final TaskField COST7 = new TaskField(COST7_VALUE, DataType.CURRENCY);
   public static final TaskField COST8 = new TaskField(COST8_VALUE, DataType.CURRENCY);
   public static final TaskField COST9 = new TaskField(COST9_VALUE, DataType.CURRENCY);
   public static final TaskField COST10 = new TaskField(COST10_VALUE, DataType.CURRENCY);
   public static final TaskField DATE1 = new TaskField(DATE1_VALUE, DataType.DATE);
   public static final TaskField DATE2 = new TaskField(DATE2_VALUE, DataType.DATE);
   public static final TaskField DATE3 = new TaskField(DATE3_VALUE, DataType.DATE);
   public static final TaskField DATE4 = new TaskField(DATE4_VALUE, DataType.DATE);
   public static final TaskField DATE5 = new TaskField(DATE5_VALUE, DataType.DATE);
   public static final TaskField DATE6 = new TaskField(DATE6_VALUE, DataType.DATE);
   public static final TaskField DATE7 = new TaskField(DATE7_VALUE, DataType.DATE);
   public static final TaskField DATE8 = new TaskField(DATE8_VALUE, DataType.DATE);
   public static final TaskField DATE9 = new TaskField(DATE9_VALUE, DataType.DATE);
   public static final TaskField DATE10 = new TaskField(DATE10_VALUE, DataType.DATE);
   public static final TaskField DURATION4 = new TaskField(DURATION4_VALUE, DataType.DURATION);
   public static final TaskField DURATION5 = new TaskField(DURATION5_VALUE, DataType.DURATION);
   public static final TaskField DURATION6 = new TaskField(DURATION6_VALUE, DataType.DURATION);
   public static final TaskField DURATION7 = new TaskField(DURATION7_VALUE, DataType.DURATION);
   public static final TaskField DURATION8 = new TaskField(DURATION8_VALUE, DataType.DURATION);
   public static final TaskField DURATION9 = new TaskField(DURATION9_VALUE, DataType.DURATION);
   public static final TaskField DURATION10 = new TaskField(DURATION10_VALUE, DataType.DURATION);
   public static final TaskField START6 = new TaskField(START6_VALUE, DataType.DATE);
   public static final TaskField FINISH6 = new TaskField(FINISH6_VALUE, DataType.DATE);
   public static final TaskField START7 = new TaskField(START7_VALUE, DataType.DATE);
   public static final TaskField FINISH7 = new TaskField(FINISH7_VALUE, DataType.DATE);
   public static final TaskField START8 = new TaskField(START8_VALUE, DataType.DATE);
   public static final TaskField FINISH8 = new TaskField(FINISH8_VALUE, DataType.DATE);
   public static final TaskField START9 = new TaskField(START9_VALUE, DataType.DATE);
   public static final TaskField FINISH9 = new TaskField(FINISH9_VALUE, DataType.DATE);
   public static final TaskField START10 = new TaskField(START10_VALUE, DataType.DATE);
   public static final TaskField FINISH10 = new TaskField(FINISH10_VALUE, DataType.DATE);
   public static final TaskField FLAG11 = new TaskField(FLAG11_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG12 = new TaskField(FLAG12_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG13 = new TaskField(FLAG13_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG14 = new TaskField(FLAG14_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG15 = new TaskField(FLAG15_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG16 = new TaskField(FLAG16_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG17 = new TaskField(FLAG17_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG18 = new TaskField(FLAG18_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG19 = new TaskField(FLAG19_VALUE, DataType.BOOLEAN);
   public static final TaskField FLAG20 = new TaskField(FLAG20_VALUE, DataType.BOOLEAN);
   public static final TaskField NUMBER6 = new TaskField(NUMBER6_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER7 = new TaskField(NUMBER7_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER8 = new TaskField(NUMBER8_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER9 = new TaskField(NUMBER9_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER10 = new TaskField(NUMBER10_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER11 = new TaskField(NUMBER11_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER12 = new TaskField(NUMBER12_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER13 = new TaskField(NUMBER13_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER14 = new TaskField(NUMBER14_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER15 = new TaskField(NUMBER15_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER16 = new TaskField(NUMBER16_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER17 = new TaskField(NUMBER17_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER18 = new TaskField(NUMBER18_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER19 = new TaskField(NUMBER19_VALUE, DataType.NUMERIC);
   public static final TaskField NUMBER20 = new TaskField(NUMBER20_VALUE, DataType.NUMERIC);
   public static final TaskField TEXT11 = new TaskField(TEXT11_VALUE, DataType.STRING);
   public static final TaskField TEXT12 = new TaskField(TEXT12_VALUE, DataType.STRING);
   public static final TaskField TEXT13 = new TaskField(TEXT13_VALUE, DataType.STRING);
   public static final TaskField TEXT14 = new TaskField(TEXT14_VALUE, DataType.STRING);
   public static final TaskField TEXT15 = new TaskField(TEXT15_VALUE, DataType.STRING);
   public static final TaskField TEXT16 = new TaskField(TEXT16_VALUE, DataType.STRING);
   public static final TaskField TEXT17 = new TaskField(TEXT17_VALUE, DataType.STRING);
   public static final TaskField TEXT18 = new TaskField(TEXT18_VALUE, DataType.STRING);
   public static final TaskField TEXT19 = new TaskField(TEXT19_VALUE, DataType.STRING);
   public static final TaskField TEXT20 = new TaskField(TEXT20_VALUE, DataType.STRING);
   public static final TaskField TEXT21 = new TaskField(TEXT21_VALUE, DataType.STRING);
   public static final TaskField TEXT22 = new TaskField(TEXT22_VALUE, DataType.STRING);
   public static final TaskField TEXT23 = new TaskField(TEXT23_VALUE, DataType.STRING);
   public static final TaskField TEXT24 = new TaskField(TEXT24_VALUE, DataType.STRING);
   public static final TaskField TEXT25 = new TaskField(TEXT25_VALUE, DataType.STRING);
   public static final TaskField TEXT26 = new TaskField(TEXT26_VALUE, DataType.STRING);
   public static final TaskField TEXT27 = new TaskField(TEXT27_VALUE, DataType.STRING);
   public static final TaskField TEXT28 = new TaskField(TEXT28_VALUE, DataType.STRING);
   public static final TaskField TEXT29 = new TaskField(TEXT29_VALUE, DataType.STRING);
   public static final TaskField TEXT30 = new TaskField(TEXT30_VALUE, DataType.STRING);
   public static final TaskField RESOURCE_PHONETICS = new TaskField(RESOURCE_PHONETICS_VALUE, DataType.STRING);
   public static final TaskField ASSIGNMENT_DELAY = new TaskField(ASSIGNMENT_DELAY_VALUE, DataType.STRING);
   public static final TaskField ASSIGNMENT_UNITS = new TaskField(ASSIGNMENT_UNITS_VALUE, DataType.STRING);
   public static final TaskField COST_RATE_TABLE = new TaskField(COST_RATE_TABLE_VALUE, DataType.STRING);
   public static final TaskField PRELEVELED_START = new TaskField(PRELEVELED_START_VALUE, DataType.DATE);
   public static final TaskField PRELEVELED_FINISH = new TaskField(PRELEVELED_FINISH_VALUE, DataType.DATE);
   public static final TaskField ESTIMATED = new TaskField(ESTIMATED_VALUE, DataType.BOOLEAN);
   public static final TaskField IGNORE_RESOURCE_CALENDAR = new TaskField(IGNORE_RESOURCE_CALENDAR_VALUE, DataType.BOOLEAN);
   public static final TaskField CALENDAR = new TaskField(CALENDAR_VALUE, DataType.STRING);
   public static final TaskField OUTLINE_CODE1 = new TaskField(OUTLINE_CODE1_VALUE, DataType.STRING);
   public static final TaskField OUTLINE_CODE2 = new TaskField(OUTLINE_CODE2_VALUE, DataType.STRING);
   public static final TaskField OUTLINE_CODE3 = new TaskField(OUTLINE_CODE3_VALUE, DataType.STRING);
   public static final TaskField OUTLINE_CODE4 = new TaskField(OUTLINE_CODE4_VALUE, DataType.STRING);
   public static final TaskField OUTLINE_CODE5 = new TaskField(OUTLINE_CODE5_VALUE, DataType.STRING);
   public static final TaskField OUTLINE_CODE6 = new TaskField(OUTLINE_CODE6_VALUE, DataType.STRING);
   public static final TaskField OUTLINE_CODE7 = new TaskField(OUTLINE_CODE7_VALUE, DataType.STRING);
   public static final TaskField OUTLINE_CODE8 = new TaskField(OUTLINE_CODE8_VALUE, DataType.STRING);
   public static final TaskField OUTLINE_CODE9 = new TaskField(OUTLINE_CODE9_VALUE, DataType.STRING);
   public static final TaskField OUTLINE_CODE10 = new TaskField(OUTLINE_CODE10_VALUE, DataType.STRING);
   public static final TaskField DEADLINE = new TaskField(DEADLINE_VALUE, DataType.DATE);
   public static final TaskField START_SLACK = new TaskField(START_SLACK_VALUE, DataType.DURATION);
   public static final TaskField FINISH_SLACK = new TaskField(FINISH_SLACK_VALUE, DataType.DURATION);
   public static final TaskField VAC = new TaskField(VAC_VALUE, DataType.NUMERIC);
   public static final TaskField GROUP_BY_SUMMARY = new TaskField(GROUP_BY_SUMMARY_VALUE, DataType.STRING);
   public static final TaskField WBS_PREDECESSORS = new TaskField(WBS_PREDECESSORS_VALUE, DataType.RELATION_LIST);
   public static final TaskField WBS_SUCCESSORS = new TaskField(WBS_SUCCESSORS_VALUE, DataType.RELATION_LIST);
   public static final TaskField RESOURCE_TYPE = new TaskField(RESOURCE_TYPE_VALUE, DataType.STRING);

   private static final TaskField[] TYPE_VALUES = new TaskField[MAX_VALUE];
   
   static
   {
      TYPE_VALUES[WORK_VALUE] = WORK;
      TYPE_VALUES[BASELINE_WORK_VALUE] = BASELINE_WORK;
      TYPE_VALUES[ACTUAL_WORK_VALUE] = ACTUAL_WORK;
      TYPE_VALUES[WORK_VARIANCE_VALUE] = WORK_VARIANCE;
      TYPE_VALUES[REMAINING_WORK_VALUE] = REMAINING_WORK;
      TYPE_VALUES[COST_VALUE] = COST;
      TYPE_VALUES[BASELINE_COST_VALUE] = BASELINE_COST;
      TYPE_VALUES[ACTUAL_COST_VALUE] = ACTUAL_COST;
      TYPE_VALUES[FIXED_COST_VALUE] = FIXED_COST;
      TYPE_VALUES[COST_VARIANCE_VALUE] = COST_VARIANCE;
      TYPE_VALUES[REMAINING_COST_VALUE] = REMAINING_COST;
      TYPE_VALUES[BCWP_VALUE] = BCWP;
      TYPE_VALUES[BCWS_VALUE] = BCWS;
      TYPE_VALUES[SV_VALUE] = SV;
      TYPE_VALUES[NAME_VALUE] = NAME;
      TYPE_VALUES[WBS_VALUE] = WBS;
      TYPE_VALUES[CONSTRAINT_TYPE_VALUE] = CONSTRAINT_TYPE;
      TYPE_VALUES[CONSTRAINT_DATE_VALUE] = CONSTRAINT_DATE;
      TYPE_VALUES[CRITICAL_VALUE] = CRITICAL;
      TYPE_VALUES[LEVELING_DELAY_VALUE] = LEVELING_DELAY;
      TYPE_VALUES[FREE_SLACK_VALUE] = FREE_SLACK;
      TYPE_VALUES[TOTAL_SLACK_VALUE] = TOTAL_SLACK;
      TYPE_VALUES[ID_VALUE] = ID;
      TYPE_VALUES[MILESTONE_VALUE] = MILESTONE;
      TYPE_VALUES[PRIORITY_VALUE] = PRIORITY;
      TYPE_VALUES[SUBPROJECT_FILE_VALUE] = SUBPROJECT_FILE;
      TYPE_VALUES[BASELINE_DURATION_VALUE] = BASELINE_DURATION;
      TYPE_VALUES[ACTUAL_DURATION_VALUE] = ACTUAL_DURATION;
      TYPE_VALUES[DURATION_VALUE] = DURATION;
      TYPE_VALUES[DURATION_VARIANCE_VALUE] = DURATION_VARIANCE;
      TYPE_VALUES[REMAINING_DURATION_VALUE] = REMAINING_DURATION;
      TYPE_VALUES[PERCENT_COMPLETE_VALUE] = PERCENT_COMPLETE;
      TYPE_VALUES[PERCENT_WORK_COMPLETE_VALUE] = PERCENT_WORK_COMPLETE;
      TYPE_VALUES[START_VALUE] = START;
      TYPE_VALUES[FINISH_VALUE] = FINISH;
      TYPE_VALUES[EARLY_START_VALUE] = EARLY_START;
      TYPE_VALUES[EARLY_FINISH_VALUE] = EARLY_FINISH;
      TYPE_VALUES[LATE_START_VALUE] = LATE_START;
      TYPE_VALUES[LATE_FINISH_VALUE] = LATE_FINISH;
      TYPE_VALUES[ACTUAL_START_VALUE] = ACTUAL_START;
      TYPE_VALUES[ACTUAL_FINISH_VALUE] = ACTUAL_FINISH;
      TYPE_VALUES[BASELINE_START_VALUE] = BASELINE_START;
      TYPE_VALUES[BASELINE_FINISH_VALUE] = BASELINE_FINISH;
      TYPE_VALUES[START_VARIANCE_VALUE] = START_VARIANCE;
      TYPE_VALUES[FINISH_VARIANCE_VALUE] = FINISH_VARIANCE;
      TYPE_VALUES[PREDECESSORS_VALUE] = PREDECESSORS;
      TYPE_VALUES[SUCCESSORS_VALUE] = SUCCESSORS;
      TYPE_VALUES[RESOURCE_NAMES_VALUE] = RESOURCE_NAMES;
      TYPE_VALUES[RESOURCE_INITIALS_VALUE] = RESOURCE_INITIALS;
      TYPE_VALUES[TEXT1_VALUE] = TEXT1;
      TYPE_VALUES[START1_VALUE] = START1;
      TYPE_VALUES[FINISH1_VALUE] = FINISH1;
      TYPE_VALUES[TEXT2_VALUE] = TEXT2;
      TYPE_VALUES[START2_VALUE] = START2;
      TYPE_VALUES[FINISH2_VALUE] = FINISH2;
      TYPE_VALUES[TEXT3_VALUE] = TEXT3;
      TYPE_VALUES[START3_VALUE] = START3;
      TYPE_VALUES[FINISH3_VALUE] = FINISH3;
      TYPE_VALUES[TEXT4_VALUE] = TEXT4;
      TYPE_VALUES[START4_VALUE] = START4;
      TYPE_VALUES[FINISH4_VALUE] = FINISH4;
      TYPE_VALUES[TEXT5_VALUE] = TEXT5;
      TYPE_VALUES[START5_VALUE] = START5;
      TYPE_VALUES[FINISH5_VALUE] = FINISH5;
      TYPE_VALUES[TEXT6_VALUE] = TEXT6;
      TYPE_VALUES[TEXT7_VALUE] = TEXT7;
      TYPE_VALUES[TEXT8_VALUE] = TEXT8;
      TYPE_VALUES[TEXT9_VALUE] = TEXT9;
      TYPE_VALUES[TEXT10_VALUE] = TEXT10;
      TYPE_VALUES[MARKED_VALUE] = MARKED;
      TYPE_VALUES[FLAG1_VALUE] = FLAG1;
      TYPE_VALUES[FLAG2_VALUE] = FLAG2;
      TYPE_VALUES[FLAG3_VALUE] = FLAG3;
      TYPE_VALUES[FLAG4_VALUE] = FLAG4;
      TYPE_VALUES[FLAG5_VALUE] = FLAG5;
      TYPE_VALUES[FLAG6_VALUE] = FLAG6;
      TYPE_VALUES[FLAG7_VALUE] = FLAG7;
      TYPE_VALUES[FLAG8_VALUE] = FLAG8;
      TYPE_VALUES[FLAG9_VALUE] = FLAG9;
      TYPE_VALUES[FLAG10_VALUE] = FLAG10;
      TYPE_VALUES[ROLLUP_VALUE] = ROLLUP;
      TYPE_VALUES[CV_VALUE] = CV;
      TYPE_VALUES[PROJECT_VALUE] = PROJECT;
      TYPE_VALUES[OUTLINE_LEVEL_VALUE] = OUTLINE_LEVEL;
      TYPE_VALUES[UNIQUE_ID_VALUE] = UNIQUE_ID;
      TYPE_VALUES[NUMBER1_VALUE] = NUMBER1;
      TYPE_VALUES[NUMBER2_VALUE] = NUMBER2;
      TYPE_VALUES[NUMBER3_VALUE] = NUMBER3;
      TYPE_VALUES[NUMBER4_VALUE] = NUMBER4;
      TYPE_VALUES[NUMBER5_VALUE] = NUMBER5;
      TYPE_VALUES[SUMMARY_VALUE] = SUMMARY;
      TYPE_VALUES[CREATED_VALUE] = CREATED;
      TYPE_VALUES[NOTES_VALUE] = NOTES;
      TYPE_VALUES[UNIQUE_ID_PREDECESSORS_VALUE] = UNIQUE_ID_PREDECESSORS;
      TYPE_VALUES[UNIQUE_ID_SUCCESSORS_VALUE] = UNIQUE_ID_SUCCESSORS;
      TYPE_VALUES[OBJECTS_VALUE] = OBJECTS;
      TYPE_VALUES[LINKED_FIELDS_VALUE] = LINKED_FIELDS;
      TYPE_VALUES[RESUME_VALUE] = RESUME;
      TYPE_VALUES[STOP_VALUE] = STOP;
      TYPE_VALUES[OUTLINE_NUMBER_VALUE] = OUTLINE_NUMBER;
      TYPE_VALUES[DURATION1_VALUE] = DURATION1;
      TYPE_VALUES[DURATION2_VALUE] = DURATION2;
      TYPE_VALUES[DURATION3_VALUE] = DURATION3;
      TYPE_VALUES[COST1_VALUE] = COST1;
      TYPE_VALUES[COST2_VALUE] = COST2;
      TYPE_VALUES[COST3_VALUE] = COST3;
      TYPE_VALUES[HIDEBAR_VALUE] = HIDEBAR;
      TYPE_VALUES[CONFIRMED_VALUE] = CONFIRMED;
      TYPE_VALUES[UPDATE_NEEDED_VALUE] = UPDATE_NEEDED;
      TYPE_VALUES[CONTACT_VALUE] = CONTACT;
      TYPE_VALUES[RESOURCE_GROUP_VALUE] = RESOURCE_GROUP;
      TYPE_VALUES[ACWP_VALUE] = ACWP;
      TYPE_VALUES[TYPE_VALUE] = TYPE;
      TYPE_VALUES[RECURRING_VALUE] = RECURRING;
      TYPE_VALUES[EFFORT_DRIVEN_VALUE] = EFFORT_DRIVEN;
      TYPE_VALUES[OVERTIME_WORK_VALUE] = OVERTIME_WORK;
      TYPE_VALUES[ACTUAL_OVERTIME_WORK_VALUE] = ACTUAL_OVERTIME_WORK;
      TYPE_VALUES[REMAINING_OVERTIME_WORK_VALUE] = REMAINING_OVERTIME_WORK;
      TYPE_VALUES[REGULAR_WORK_VALUE] = REGULAR_WORK;
      TYPE_VALUES[OVERTIME_COST_VALUE] = OVERTIME_COST;
      TYPE_VALUES[ACTUAL_OVERTIME_COST_VALUE] = ACTUAL_OVERTIME_COST;
      TYPE_VALUES[REMAINING_OVERTIME_COST_VALUE] = REMAINING_OVERTIME_COST;
      TYPE_VALUES[FIXED_COST_ACCRUAL_VALUE] = FIXED_COST_ACCRUAL;
      TYPE_VALUES[INDICATORS_VALUE] = INDICATORS;
      TYPE_VALUES[HYPERLINK_VALUE] = HYPERLINK;
      TYPE_VALUES[HYPERLINK_ADDRESS_VALUE] = HYPERLINK_ADDRESS;
      TYPE_VALUES[HYPERLINK_SUBADDRESS_VALUE] = HYPERLINK_SUBADDRESS;
      TYPE_VALUES[HYPERLINK_HREF_VALUE] = HYPERLINK_HREF;
      TYPE_VALUES[ASSIGNMENT_VALUE] = ASSIGNMENT;
      TYPE_VALUES[OVERALLOCATED_VALUE] = OVERALLOCATED;
      TYPE_VALUES[EXTERNAL_TASK_VALUE] = EXTERNAL_TASK;
      TYPE_VALUES[SUBPROJECT_READ_ONLY_VALUE] = SUBPROJECT_READ_ONLY;
      TYPE_VALUES[RESPONSE_PENDING_VALUE] = RESPONSE_PENDING;
      TYPE_VALUES[TEAMSTATUS_PENDING_VALUE] = TEAMSTATUS_PENDING;
      TYPE_VALUES[LEVELING_CAN_SPLIT_VALUE] = LEVELING_CAN_SPLIT;
      TYPE_VALUES[LEVEL_ASSIGNMENTS_VALUE] = LEVEL_ASSIGNMENTS;
      TYPE_VALUES[WORK_CONTOUR_VALUE] = WORK_CONTOUR;
      TYPE_VALUES[COST4_VALUE] = COST4;
      TYPE_VALUES[COST5_VALUE] = COST5;
      TYPE_VALUES[COST6_VALUE] = COST6;
      TYPE_VALUES[COST7_VALUE] = COST7;
      TYPE_VALUES[COST8_VALUE] = COST8;
      TYPE_VALUES[COST9_VALUE] = COST9;
      TYPE_VALUES[COST10_VALUE] = COST10;
      TYPE_VALUES[DATE1_VALUE] = DATE1;
      TYPE_VALUES[DATE2_VALUE] = DATE2;
      TYPE_VALUES[DATE3_VALUE] = DATE3;
      TYPE_VALUES[DATE4_VALUE] = DATE4;
      TYPE_VALUES[DATE5_VALUE] = DATE5;
      TYPE_VALUES[DATE6_VALUE] = DATE6;
      TYPE_VALUES[DATE7_VALUE] = DATE7;
      TYPE_VALUES[DATE8_VALUE] = DATE8;
      TYPE_VALUES[DATE9_VALUE] = DATE9;
      TYPE_VALUES[DATE10_VALUE] = DATE10;
      TYPE_VALUES[DURATION4_VALUE] = DURATION4;
      TYPE_VALUES[DURATION5_VALUE] = DURATION5;
      TYPE_VALUES[DURATION6_VALUE] = DURATION6;
      TYPE_VALUES[DURATION7_VALUE] = DURATION7;
      TYPE_VALUES[DURATION8_VALUE] = DURATION8;
      TYPE_VALUES[DURATION9_VALUE] = DURATION9;
      TYPE_VALUES[DURATION10_VALUE] = DURATION10;
      TYPE_VALUES[START6_VALUE] = START6;
      TYPE_VALUES[FINISH6_VALUE] = FINISH6;
      TYPE_VALUES[START7_VALUE] = START7;
      TYPE_VALUES[FINISH7_VALUE] = FINISH7;
      TYPE_VALUES[START8_VALUE] = START8;
      TYPE_VALUES[FINISH8_VALUE] = FINISH8;
      TYPE_VALUES[START9_VALUE] = START9;
      TYPE_VALUES[FINISH9_VALUE] = FINISH9;
      TYPE_VALUES[START10_VALUE] = START10;
      TYPE_VALUES[FINISH10_VALUE] = FINISH10;
      TYPE_VALUES[FLAG11_VALUE] = FLAG11;
      TYPE_VALUES[FLAG12_VALUE] = FLAG12;
      TYPE_VALUES[FLAG13_VALUE] = FLAG13;
      TYPE_VALUES[FLAG14_VALUE] = FLAG14;
      TYPE_VALUES[FLAG15_VALUE] = FLAG15;
      TYPE_VALUES[FLAG16_VALUE] = FLAG16;
      TYPE_VALUES[FLAG17_VALUE] = FLAG17;
      TYPE_VALUES[FLAG18_VALUE] = FLAG18;
      TYPE_VALUES[FLAG19_VALUE] = FLAG19;
      TYPE_VALUES[FLAG20_VALUE] = FLAG20;
      TYPE_VALUES[NUMBER6_VALUE] = NUMBER6;
      TYPE_VALUES[NUMBER7_VALUE] = NUMBER7;
      TYPE_VALUES[NUMBER8_VALUE] = NUMBER8;
      TYPE_VALUES[NUMBER9_VALUE] = NUMBER9;
      TYPE_VALUES[NUMBER10_VALUE] = NUMBER10;
      TYPE_VALUES[NUMBER11_VALUE] = NUMBER11;
      TYPE_VALUES[NUMBER12_VALUE] = NUMBER12;
      TYPE_VALUES[NUMBER13_VALUE] = NUMBER13;
      TYPE_VALUES[NUMBER14_VALUE] = NUMBER14;
      TYPE_VALUES[NUMBER15_VALUE] = NUMBER15;
      TYPE_VALUES[NUMBER16_VALUE] = NUMBER16;
      TYPE_VALUES[NUMBER17_VALUE] = NUMBER17;
      TYPE_VALUES[NUMBER18_VALUE] = NUMBER18;
      TYPE_VALUES[NUMBER19_VALUE] = NUMBER19;
      TYPE_VALUES[NUMBER20_VALUE] = NUMBER20;
      TYPE_VALUES[TEXT11_VALUE] = TEXT11;
      TYPE_VALUES[TEXT12_VALUE] = TEXT12;
      TYPE_VALUES[TEXT13_VALUE] = TEXT13;
      TYPE_VALUES[TEXT14_VALUE] = TEXT14;
      TYPE_VALUES[TEXT15_VALUE] = TEXT15;
      TYPE_VALUES[TEXT16_VALUE] = TEXT16;
      TYPE_VALUES[TEXT17_VALUE] = TEXT17;
      TYPE_VALUES[TEXT18_VALUE] = TEXT18;
      TYPE_VALUES[TEXT19_VALUE] = TEXT19;
      TYPE_VALUES[TEXT20_VALUE] = TEXT20;
      TYPE_VALUES[TEXT21_VALUE] = TEXT21;
      TYPE_VALUES[TEXT22_VALUE] = TEXT22;
      TYPE_VALUES[TEXT23_VALUE] = TEXT23;
      TYPE_VALUES[TEXT24_VALUE] = TEXT24;
      TYPE_VALUES[TEXT25_VALUE] = TEXT25;
      TYPE_VALUES[TEXT26_VALUE] = TEXT26;
      TYPE_VALUES[TEXT27_VALUE] = TEXT27;
      TYPE_VALUES[TEXT28_VALUE] = TEXT28;
      TYPE_VALUES[TEXT29_VALUE] = TEXT29;
      TYPE_VALUES[TEXT30_VALUE] = TEXT30;
      TYPE_VALUES[RESOURCE_PHONETICS_VALUE] = RESOURCE_PHONETICS;
      TYPE_VALUES[ASSIGNMENT_DELAY_VALUE] = ASSIGNMENT_DELAY;
      TYPE_VALUES[ASSIGNMENT_UNITS_VALUE] = ASSIGNMENT_UNITS;
      TYPE_VALUES[COST_RATE_TABLE_VALUE] = COST_RATE_TABLE;
      TYPE_VALUES[PRELEVELED_START_VALUE] = PRELEVELED_START;
      TYPE_VALUES[PRELEVELED_FINISH_VALUE] = PRELEVELED_FINISH;
      TYPE_VALUES[ESTIMATED_VALUE] = ESTIMATED;
      TYPE_VALUES[IGNORE_RESOURCE_CALENDAR_VALUE] = IGNORE_RESOURCE_CALENDAR;
      TYPE_VALUES[CALENDAR_VALUE] = CALENDAR;
      TYPE_VALUES[OUTLINE_CODE1_VALUE] = OUTLINE_CODE1;
      TYPE_VALUES[OUTLINE_CODE2_VALUE] = OUTLINE_CODE2;
      TYPE_VALUES[OUTLINE_CODE3_VALUE] = OUTLINE_CODE3;
      TYPE_VALUES[OUTLINE_CODE4_VALUE] = OUTLINE_CODE4;
      TYPE_VALUES[OUTLINE_CODE5_VALUE] = OUTLINE_CODE5;
      TYPE_VALUES[OUTLINE_CODE6_VALUE] = OUTLINE_CODE6;
      TYPE_VALUES[OUTLINE_CODE7_VALUE] = OUTLINE_CODE7;
      TYPE_VALUES[OUTLINE_CODE8_VALUE] = OUTLINE_CODE8;
      TYPE_VALUES[OUTLINE_CODE9_VALUE] = OUTLINE_CODE9;
      TYPE_VALUES[OUTLINE_CODE10_VALUE] = OUTLINE_CODE10;
      TYPE_VALUES[DEADLINE_VALUE] = DEADLINE;
      TYPE_VALUES[START_SLACK_VALUE] = START_SLACK;
      TYPE_VALUES[FINISH_SLACK_VALUE] = FINISH_SLACK;
      TYPE_VALUES[VAC_VALUE] = VAC;
      TYPE_VALUES[GROUP_BY_SUMMARY_VALUE] = GROUP_BY_SUMMARY;
      TYPE_VALUES[WBS_PREDECESSORS_VALUE] = WBS_PREDECESSORS;
      TYPE_VALUES[WBS_SUCCESSORS_VALUE] = WBS_SUCCESSORS;
      TYPE_VALUES[RESOURCE_TYPE_VALUE] = RESOURCE_TYPE;
   }
   
   private int m_value;
   private DataType m_dataType;
}
