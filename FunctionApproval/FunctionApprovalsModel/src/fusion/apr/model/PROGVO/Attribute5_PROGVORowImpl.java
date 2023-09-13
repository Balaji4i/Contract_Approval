package fusion.apr.model.PROGVO;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed May 02 16:18:44 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Attribute5_PROGVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Atr5Key {
            public Object get(Attribute5_PROGVORowImpl obj) {
                return obj.getAtr5Key();
            }

            public void put(Attribute5_PROGVORowImpl obj, Object value) {
                obj.setAtr5Key((String)value);
            }
        }
        ,
        Atr5Value {
            public Object get(Attribute5_PROGVORowImpl obj) {
                return obj.getAtr5Value();
            }

            public void put(Attribute5_PROGVORowImpl obj, Object value) {
                obj.setAtr5Value((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(Attribute5_PROGVORowImpl object);

        public abstract void put(Attribute5_PROGVORowImpl object,
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


    public static final int ATR5KEY = AttributesEnum.Atr5Key.index();
    public static final int ATR5VALUE = AttributesEnum.Atr5Value.index();

    /**
     * This is the default constructor (do not remove).
     */
    public Attribute5_PROGVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Atr5Key.
     * @return the Atr5Key
     */
    public String getAtr5Key() {
        return (String) getAttributeInternal(ATR5KEY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Atr5Key.
     * @param value value to set the  Atr5Key
     */
    public void setAtr5Key(String value) {
        setAttributeInternal(ATR5KEY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Atr5Value.
     * @return the Atr5Value
     */
    public String getAtr5Value() {
        return (String) getAttributeInternal(ATR5VALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Atr5Value.
     * @param value value to set the  Atr5Value
     */
    public void setAtr5Value(String value) {
        setAttributeInternal(ATR5VALUE, value);
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
