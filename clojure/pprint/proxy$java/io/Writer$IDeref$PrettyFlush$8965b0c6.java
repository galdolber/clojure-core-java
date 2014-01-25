package clojure.pprint.proxy$java.io;

import java.util.*;
import clojure.lang.*;

public class Writer$IDeref$PrettyFlush$8965b0c6 extends java.io.Writer implements IProxy, clojure.lang.IDeref, clojure.pprint.PrettyFlush {

 private volatile IPersistentMap __clojureFnMap;

 public Writer$IDeref$PrettyFlush$8965b0c6() {
  super();
 }
 public Writer$IDeref$PrettyFlush$8965b0c6(java.lang.Object p0) {
  super(p0);
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
 public java.lang.String toString() {
  final Object value = RT.get(this.__clojureFnMap, "toString");
  return (value != null) ? (java.lang.String)((IFn)value).invoke(this) : super.toString();
 }
 public java.lang.Object clone() throws java.lang.CloneNotSupportedException  {
  final Object value = RT.get(this.__clojureFnMap, "clone");
  return (value != null) ? (java.lang.Object)((IFn)value).invoke(this) : super.clone();
 }
 public java.io.Writer append(char p0) throws java.io.IOException  {
  final Object value = RT.get(this.__clojureFnMap, "append");
  return (value != null) ? (java.io.Writer)((IFn)value).invoke(this, p0) : super.append(p0);
 }
 public void flush() throws java.io.IOException  {
  final Object value = RT.get(this.__clojureFnMap, "flush");
  if (value != null) {((IFn)value).invoke(this); } 
 }
 public java.io.Writer append(java.lang.CharSequence p0, int p1, int p2) throws java.io.IOException  {
  final Object value = RT.get(this.__clojureFnMap, "append");
  return (value != null) ? (java.io.Writer)((IFn)value).invoke(this, p0, p1, p2) : super.append(p0, p1, p2);
 }
 public java.io.Writer append(java.lang.CharSequence p0) throws java.io.IOException  {
  final Object value = RT.get(this.__clojureFnMap, "append");
  return (value != null) ? (java.io.Writer)((IFn)value).invoke(this, p0) : super.append(p0);
 }
 public void write(java.lang.String p0, int p1, int p2) throws java.io.IOException  {
  final Object value = RT.get(this.__clojureFnMap, "write");
  if (value != null) {((IFn)value).invoke(this, p0, p1, p2); } else { super.write(p0, p1, p2); }
 }
 public void write(java.lang.String p0) throws java.io.IOException  {
  final Object value = RT.get(this.__clojureFnMap, "write");
  if (value != null) {((IFn)value).invoke(this, p0); } else { super.write(p0); }
 }
 public void write(char[] p0, int p1, int p2) throws java.io.IOException  {
  final Object value = RT.get(this.__clojureFnMap, "write");
  if (value != null) {((IFn)value).invoke(this, p0, p1, p2); } 
 }
 public void write(char[] p0) throws java.io.IOException  {
  final Object value = RT.get(this.__clojureFnMap, "write");
  if (value != null) {((IFn)value).invoke(this, p0); } else { super.write(p0); }
 }
 public void write(int p0) throws java.io.IOException  {
  final Object value = RT.get(this.__clojureFnMap, "write");
  if (value != null) {((IFn)value).invoke(this, p0); } else { super.write(p0); }
 }
 public int hashCode() {
  final Object value = RT.get(this.__clojureFnMap, "hashCode");
  return (value != null) ? (int)((java.lang.Number)((IFn)value).invoke(this)).intValue() : super.hashCode();
 }
 public void close() throws java.io.IOException  {
  final Object value = RT.get(this.__clojureFnMap, "close");
  if (value != null) {((IFn)value).invoke(this); } 
 }
 public boolean equals(java.lang.Object p0) {
  final Object value = RT.get(this.__clojureFnMap, "equals");
  return (value != null) ? (boolean)((java.lang.Boolean)((IFn)value).invoke(this, p0)).booleanValue() : super.equals(p0);
 }
 public java.lang.Object deref() {
  final Object value = RT.get(this.__clojureFnMap, "deref");
  return (value != null) ? (java.lang.Object)((IFn)value).invoke(this) : null;
 }
 public void ppflush() {
  final Object value = RT.get(this.__clojureFnMap, "ppflush");
  if (value != null) {((IFn)value).invoke(this); } 
 }
}
