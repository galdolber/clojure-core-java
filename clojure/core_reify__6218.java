package clojure;

import clojure.lang.*;

public final class core_reify__6218 extends java.lang.Object implements clojure.core.ArrayManager, clojure.lang.IObj {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "double-array");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "alength");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "aclone");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "aget");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "aset");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "double");
 }
 final clojure.lang.IPersistentMap __meta;
 public core_reify__6218(final clojure.lang.IPersistentMap __meta) {
  super();
  this.__meta = __meta;
 }
 public core_reify__6218() {
  this(null);
 }
 public clojure.lang.IPersistentMap meta() { return this.__meta; }
 public clojure.lang.IObj withMeta(clojure.lang.IPersistentMap __meta) {
  return new core_reify__6218(__meta);
 }
 public java.lang.Object aset(java.lang.Object G__62171, int i__6205__auto__2, java.lang.Object val__6206__auto__3)  {
  return Double.valueOf(clojure.lang.RT.aset((double[])((double[])G__62171), (int)clojure.lang.RT.intCast((int)i__6205__auto__2), (double)clojure.lang.RT.doubleCast(((java.lang.Object)val__6206__auto__3))));
 }
 public java.lang.Object aget(java.lang.Object G__62171, int i__6205__auto__2)  {
  return Double.valueOf(clojure.lang.RT.aget((double[])((double[])G__62171), (int)clojure.lang.RT.intCast((int)i__6205__auto__2)));
 }
 public java.lang.Object aclone(java.lang.Object G__62171)  {
  return ((double[])clojure.lang.RT.aclone((double[])((double[])G__62171)));
 }
 public int alength(java.lang.Object G__62171)  {
  return clojure.lang.RT.alength((double[])((double[])G__62171));
 }
 public java.lang.Object array(int size__6204__auto__1)  {
  return ((double[])clojure.lang.Numbers.double_array(((java.lang.Object)Integer.valueOf(size__6204__auto__1))));
 }
}
