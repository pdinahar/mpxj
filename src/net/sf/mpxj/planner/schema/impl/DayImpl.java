//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.3-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.02.21 at 11:46:13 GMT 
//


package net.sf.mpxj.planner.schema.impl;

public class DayImpl implements net.sf.mpxj.planner.schema.Day, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sf.mpxj.planner.schema.impl.runtime.UnmarshallableObject, net.sf.mpxj.planner.schema.impl.runtime.XMLSerializable, net.sf.mpxj.planner.schema.impl.runtime.ValidatableObject
{

    protected java.lang.String _Type;
    protected com.sun.xml.bind.util.ListImpl _Interval;
    protected java.lang.String _Date;
    protected java.lang.String _Id;
    public final static java.lang.Class version = (net.sf.mpxj.planner.schema.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sf.mpxj.planner.schema.Day.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "day";
    }

    public java.lang.String getType() {
        return _Type;
    }

    public void setType(java.lang.String value) {
        _Type = value;
    }

    protected com.sun.xml.bind.util.ListImpl _getInterval() {
        if (_Interval == null) {
            _Interval = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Interval;
    }

    public java.util.List getInterval() {
        return _getInterval();
    }

    public java.lang.String getDate() {
        return _Date;
    }

    public void setDate(java.lang.String value) {
        _Date = value;
    }

    public java.lang.String getId() {
        return _Id;
    }

    public void setId(java.lang.String value) {
        _Id = value;
    }

    public net.sf.mpxj.planner.schema.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sf.mpxj.planner.schema.impl.runtime.UnmarshallingContext context) {
        return new net.sf.mpxj.planner.schema.impl.DayImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sf.mpxj.planner.schema.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Interval == null)? 0 :_Interval.size());
        context.startElement("", "day");
        int idx_1 = idx2;
        while (idx_1 != len2) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Interval.get(idx_1 ++)), "Interval");
        }
        context.endNamespaceDecls();
        int idx_4 = idx2;
        context.startAttribute("", "type");
        try {
            context.text(((java.lang.String) _Type), "Type");
        } catch (java.lang.Exception e) {
            net.sf.mpxj.planner.schema.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        context.startAttribute("", "date");
        try {
            context.text(((java.lang.String) _Date), "Date");
        } catch (java.lang.Exception e) {
            net.sf.mpxj.planner.schema.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endAttribute();
        if (_Id!= null) {
            context.startAttribute("", "id");
            try {
                context.text(((java.lang.String) _Id), "Id");
            } catch (java.lang.Exception e) {
                net.sf.mpxj.planner.schema.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        while (idx_4 != len2) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Interval.get(idx_4 ++)), "Interval");
        }
        context.endAttributes();
        while (idx2 != len2) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Interval.get(idx2 ++)), "Interval");
        }
        context.endElement();
    }

    public void serializeAttributes(net.sf.mpxj.planner.schema.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Interval == null)? 0 :_Interval.size());
    }

    public void serializeURIs(net.sf.mpxj.planner.schema.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_Interval == null)? 0 :_Interval.size());
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sf.mpxj.planner.schema.Day.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"r\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\t"
+"nameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004ppsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004"
+"namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004ppsr\u0000-com.sun.msv."
+"datatype.xsd.NormalizedStringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv."
+"datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.su"
+"n.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.m"
+"sv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datat"
+"ype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lan"
+"g/String;L\u0000\btypeNameq\u0000~\u0000\u0017L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/dataty"
+"pe/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSc"
+"hemat\u0000\u0010normalizedStringsr\u00004com.sun.msv.datatype.xsd.WhiteSpa"
+"ceProcessor$Replace\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.W"
+"hiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expr"
+"ession$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004ppsr\u0000\u001bcom.sun.msv.u"
+"til.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0017L\u0000\fnamespaceURIq\u0000~"
+"\u0000\u0017xpt\u0000\u0005CDATAt\u0000\u0000sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0017L\u0000\fnamespaceURIq\u0000~\u0000\u0017xr\u0000\u001dcom.sun.msv.gr"
+"ammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpt\u0000\u0004typeq\u0000~\u0000$sq\u0000~\u0000\fppq\u0000~\u0000\u0011sq\u0000~\u0000%t"
+"\u0000\u0004dateq\u0000~\u0000$sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000"
+"\bppsq\u0000~\u0000\fsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000pq\u0000~\u0000\u0011sq"
+"\u0000~\u0000%t\u0000\u0002idq\u0000~\u0000$sr\u00000com.sun.msv.grammar.Expression$EpsilonExpr"
+"ession\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000/\u0001q\u0000~\u00004sq\u0000~\u0000,ppsr\u0000 com.sun.msv.g"
+"rammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryE"
+"xp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004q\u0000~\u00000psq\u0000~\u0000\u0000q\u0000~\u00000p\u0000sq\u0000~\u0000,ppsq\u0000"
+"~\u00007q\u0000~\u00000psq\u0000~\u0000\fq\u0000~\u00000psr\u00002com.sun.msv.grammar.Expression$AnyS"
+"tringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u00005q\u0000~\u0000?sr\u0000 com.sun.msv.gr"
+"ammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000&q\u0000~\u00004sq\u0000~\u0000%t\u0000#net.sf.mpxj"
+".planner.schema.Intervalt\u0000+http://java.sun.com/jaxb/xjc/dumm"
+"y-elementsq\u0000~\u00004sq\u0000~\u0000%t\u0000\u0003dayq\u0000~\u0000$sr\u0000\"com.sun.msv.grammar.Expr"
+"essionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expr"
+"essionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPo"
+"ol$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$"
+"Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\b\u0001pq\u0000~\u0000\tq\u0000~\u00006q\u0000~\u0000\nq"
+"\u0000~\u00009q\u0000~\u0000;q\u0000~\u0000-q\u0000~\u0000\u000bq\u0000~\u0000<x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sf.mpxj.planner.schema.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sf.mpxj.planner.schema.impl.runtime.UnmarshallingContext context) {
            super(context, "-------------");
        }

        protected Unmarshaller(net.sf.mpxj.planner.schema.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sf.mpxj.planner.schema.impl.DayImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("day" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  7 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 10;
                            continue outer;
                        }
                        state = 10;
                        continue outer;
                    case  11 :
                        if (("interval" == ___local)&&("" == ___uri)) {
                            _getInterval().add(((net.sf.mpxj.planner.schema.impl.IntervalImpl) spawnChildFromEnterElement((net.sf.mpxj.planner.schema.impl.IntervalImpl.class), 11, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "type");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 4;
                            continue outer;
                        }
                        break;
                    case  4 :
                        attIdx = context.getAttribute("", "date");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 7;
                            continue outer;
                        }
                        break;
                    case  10 :
                        if (("interval" == ___local)&&("" == ___uri)) {
                            _getInterval().add(((net.sf.mpxj.planner.schema.impl.IntervalImpl) spawnChildFromEnterElement((net.sf.mpxj.planner.schema.impl.IntervalImpl.class), 11, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 11;
                        continue outer;
                    case  12 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Id = com.sun.xml.bind.WhiteSpaceProcessor.replace(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Type = com.sun.xml.bind.WhiteSpaceProcessor.replace(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Date = com.sun.xml.bind.WhiteSpaceProcessor.replace(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  7 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 10;
                            continue outer;
                        }
                        state = 10;
                        continue outer;
                    case  11 :
                        if (("day" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 12;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "type");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 4;
                            continue outer;
                        }
                        break;
                    case  4 :
                        attIdx = context.getAttribute("", "date");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 7;
                            continue outer;
                        }
                        break;
                    case  10 :
                        state = 11;
                        continue outer;
                    case  12 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  7 :
                        if (("id" == ___local)&&("" == ___uri)) {
                            state = 8;
                            return ;
                        }
                        state = 10;
                        continue outer;
                    case  1 :
                        if (("type" == ___local)&&("" == ___uri)) {
                            state = 2;
                            return ;
                        }
                        break;
                    case  4 :
                        if (("date" == ___local)&&("" == ___uri)) {
                            state = 5;
                            return ;
                        }
                        break;
                    case  10 :
                        state = 11;
                        continue outer;
                    case  12 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  7 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText1(v);
                            state = 10;
                            continue outer;
                        }
                        state = 10;
                        continue outer;
                    case  1 :
                        attIdx = context.getAttribute("", "type");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText2(v);
                            state = 4;
                            continue outer;
                        }
                        break;
                    case  3 :
                        if (("type" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        break;
                    case  4 :
                        attIdx = context.getAttribute("", "date");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            eatText3(v);
                            state = 7;
                            continue outer;
                        }
                        break;
                    case  6 :
                        if (("date" == ___local)&&("" == ___uri)) {
                            state = 7;
                            return ;
                        }
                        break;
                    case  10 :
                        state = 11;
                        continue outer;
                    case  9 :
                        if (("id" == ___local)&&("" == ___uri)) {
                            state = 10;
                            return ;
                        }
                        break;
                    case  12 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  7 :
                            attIdx = context.getAttribute("", "id");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText1(v);
                                state = 10;
                                continue outer;
                            }
                            state = 10;
                            continue outer;
                        case  1 :
                            attIdx = context.getAttribute("", "type");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText2(v);
                                state = 4;
                                continue outer;
                            }
                            break;
                        case  2 :
                            eatText2(value);
                            state = 3;
                            return ;
                        case  4 :
                            attIdx = context.getAttribute("", "date");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                eatText3(v);
                                state = 7;
                                continue outer;
                            }
                            break;
                        case  5 :
                            eatText3(value);
                            state = 6;
                            return ;
                        case  10 :
                            state = 11;
                            continue outer;
                        case  8 :
                            eatText1(value);
                            state = 9;
                            return ;
                        case  12 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}