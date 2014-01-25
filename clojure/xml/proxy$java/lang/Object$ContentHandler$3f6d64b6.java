package clojure.xml.proxy$java.lang;

import java.util.*;
import clojure.lang.*;

public class Object$ContentHandler$3f6d64b6 extends java.lang.Object implements IProxy, org.xml.sax.ContentHandler {

 private volatile IPersistentMap __clojureFnMap;

 public Object$ContentHandler$3f6d64b6() {
  super();
 }
 public void __initClojureFnMappings(final IPersistentMap _clojureFnMap) {
  this.__clojureFnMap = _clojureFnMap;
 }
 public void __updateClojureFnMappings(final IPersistentMap persistentMap) {
  this.__clojureFnMap = (IPersistentMap)((IPersistentCollection)this.__clojureFnMap).cons(persistentMap);
 }
 public IPersistentMap __getClojureFnMappings() {
  return this.__clojureFnMap;
 }
 public java.lang.Object clone() throws java.lang.CloneNotSupportedException  {
  final Object value = RT.get(this.__clojureFnMap, "clone");
  return (value != null) ? (java.lang.Object)((IFn)value).invoke(this) : super.clone();
 }
 public int hashCode() {
  final Object value = RT.get(this.__clojureFnMap, "hashCode");
  return (value != null) ? (int)((java.lang.Number)((IFn)value).invoke(this)).intValue() : super.hashCode();
 }
 public java.lang.String toString() {
  final Object value = RT.get(this.__clojureFnMap, "toString");
  return (value != null) ? (java.lang.String)((IFn)value).invoke(this) : super.toString();
 }
 public boolean equals(java.lang.Object p0) {
  final Object value = RT.get(this.__clojureFnMap, "equals");
  return (value != null) ? (boolean)((java.lang.Boolean)((IFn)value).invoke(this, p0)).booleanValue() : super.equals(p0);
 }
 public void endElement(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws org.xml.sax.SAXException  {
  final Object value = RT.get(this.__clojureFnMap, "endElement");
  if (value != null) {((IFn)value).invoke(this, p0, p1, p2); } 
 }
 public void endPrefixMapping(java.lang.String p0) throws org.xml.sax.SAXException  {
  final Object value = RT.get(this.__clojureFnMap, "endPrefixMapping");
  if (value != null) {((IFn)value).invoke(this, p0); } 
 }
 public void startElement(java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3) throws org.xml.sax.SAXException  {
  final Object value = RT.get(this.__clojureFnMap, "startElement");
  if (value != null) {((IFn)value).invoke(this, p0, p1, p2, p3); } 
 }
 public void characters(char[] p0, int p1, int p2) throws org.xml.sax.SAXException  {
  final Object value = RT.get(this.__clojureFnMap, "characters");
  if (value != null) {((IFn)value).invoke(this, p0, p1, p2); } 
 }
 public void ignorableWhitespace(char[] p0, int p1, int p2) throws org.xml.sax.SAXException  {
  final Object value = RT.get(this.__clojureFnMap, "ignorableWhitespace");
  if (value != null) {((IFn)value).invoke(this, p0, p1, p2); } 
 }
 public void endDocument() throws org.xml.sax.SAXException  {
  final Object value = RT.get(this.__clojureFnMap, "endDocument");
  if (value != null) {((IFn)value).invoke(this); } 
 }
 public void startPrefixMapping(java.lang.String p0, java.lang.String p1) throws org.xml.sax.SAXException  {
  final Object value = RT.get(this.__clojureFnMap, "startPrefixMapping");
  if (value != null) {((IFn)value).invoke(this, p0, p1); } 
 }
 public void processingInstruction(java.lang.String p0, java.lang.String p1) throws org.xml.sax.SAXException  {
  final Object value = RT.get(this.__clojureFnMap, "processingInstruction");
  if (value != null) {((IFn)value).invoke(this, p0, p1); } 
 }
 public void startDocument() throws org.xml.sax.SAXException  {
  final Object value = RT.get(this.__clojureFnMap, "startDocument");
  if (value != null) {((IFn)value).invoke(this); } 
 }
 public void skippedEntity(java.lang.String p0) throws org.xml.sax.SAXException  {
  final Object value = RT.get(this.__clojureFnMap, "skippedEntity");
  if (value != null) {((IFn)value).invoke(this, p0); } 
 }
 public void setDocumentLocator(org.xml.sax.Locator p0) {
  final Object value = RT.get(this.__clojureFnMap, "setDocumentLocator");
  if (value != null) {((IFn)value).invoke(this, p0); } 
 }
}
