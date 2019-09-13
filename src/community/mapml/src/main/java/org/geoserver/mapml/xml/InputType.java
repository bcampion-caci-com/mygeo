//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.12.17 at 04:13:52 PM PST
//

package org.geoserver.mapml.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for inputType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="inputType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="zoom"/>
 *     &lt;enumeration value="hidden"/>
 *     &lt;enumeration value="location"/>
 *     &lt;enumeration value="datetime"/>
 *     &lt;enumeration value="width"/>
 *     &lt;enumeration value="height"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "inputType")
@XmlEnum
public enum InputType {
    @XmlEnumValue("zoom")
    ZOOM("zoom"),
    @XmlEnumValue("hidden")
    HIDDEN("hidden"),
    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("datetime")
    DATETIME("datetime"),
    @XmlEnumValue("width")
    WIDTH("width"),
    @XmlEnumValue("height")
    HEIGHT("height");
    private final String value;

    InputType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InputType fromValue(String v) {
        for (InputType c : InputType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
