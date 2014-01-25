package clojure;

import clojure.lang.*;

public final class xml_fn__6926_push_chars__6930_fn__6931 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "char");
 }
 public xml_fn__6926_push_chars__6930_fn__6931() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__6925_SHARP_1) {
  return (java.lang.Character.isWhitespace((char)clojure.lang.RT.charCast(((java.lang.Object)p1__6925_SHARP_1))) ? Boolean.TRUE : Boolean.FALSE);
 }
}
