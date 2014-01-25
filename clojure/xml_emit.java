package clojure;

import clojure.lang.*;

public final class xml_emit extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__1 = (clojure.lang.Var)RT.var("clojure.xml", "emit-element");
 }
 public xml_emit() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  ((IFn)const__0.getRawRoot()).invoke("<?xml version='1.0' encoding='UTF-8'?>");
  return ((IFn)const__1.getRawRoot()).invoke(x1);
 }
}
