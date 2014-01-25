package clojure.instant.proxy$java.lang;

import java.util.*;
import clojure.lang.*;

public class ThreadLocal$0 extends java.lang.ThreadLocal implements IProxy {

 private volatile IPersistentMap __clojureFnMap;

 public ThreadLocal$0() {
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
 public java.lang.Object initialValue() {
  final Object value = RT.get(this.__clojureFnMap, "initialValue");
  return (value != null) ? (java.lang.Object)((IFn)value).invoke(this) : super.initialValue();
 }
 public void set(java.lang.Object p0) {
  final Object value = RT.get(this.__clojureFnMap, "set");
  if (value != null) {((IFn)value).invoke(this, p0); } else { super.set(p0); }
 }
 public java.lang.Object get() {
  final Object value = RT.get(this.__clojureFnMap, "get");
  return (value != null) ? (java.lang.Object)((IFn)value).invoke(this) : super.get();
 }
 public void remove() {
  final Object value = RT.get(this.__clojureFnMap, "remove");
  if (value != null) {((IFn)value).invoke(this); } else { super.remove(); }
 }
}
