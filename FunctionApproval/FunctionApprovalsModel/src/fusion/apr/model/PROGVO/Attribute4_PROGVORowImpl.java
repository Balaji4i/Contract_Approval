package fusion.apr.model.PROGVO;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed May 02 16:18:36 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Attribute4_PROGVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Atr4Key {
            public Object get(Attribute4_PROGVORowImpl obj) {
                return obj.getAtr4Key();
            }

            public void put(Attribute4_PROGVORowImpl obj, Object value) {
                obj.setAtr4Key((String)value);
            }
        }
        ,
        Atr4Value {
            public Object get(Attribute4_PROGVORowImpl obj) {
                return obj.getAtr4Value();
            }

            public void put(Attribute4_PROGVORowImpl obj, Object value) {
                obj.setAtr4Value((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(Attribute4_PROGVORowImpl object);

        public abstract void put(Attribute4_PROGVORowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int ATR4KEY = AttributesEnum.Atr4Key.index();
    public static final int ATR4VALUE = AttributesEnum.Atr4Value.index();

    /**
     * This is the default constructor (do not remove).
     */
    public Attribute4_PROGVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Atr4Key.
     * @return the Atr4Key
     */
    public String getAtr4Key() {
        return (String) getAttributeInternal(ATR4KEY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Atr4Key.
     * @param value value to set the  Atr4Key
     */
    public void setAtr4Key(String value) {
        setAttributeInternal(ATR4KEY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Atr4Value.
     * @return the Atr4Value
     */
    public String getAtr4Value() {
        return (String) getAttributeInternal(ATR4VALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Atr4Value.
     * @param value value to set the  Atr4Value
     */
    public void setAtr4Value(String value) {
        setAttributeInternal(ATR4VALUE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}