package clojure;

import clojure.lang.*;

public final class core_namespace_munge extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__1 = (java.lang.Object)Character.valueOf((char)45);
  const__2 = (java.lang.Object)Character.valueOf((char)95);
 }
 public core_namespace_munge() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ns1) {
  return ((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke(ns1)).replace((char)((Character)const__1).charValue(), (char)((Character)const__2).charValue()));
 }
}
