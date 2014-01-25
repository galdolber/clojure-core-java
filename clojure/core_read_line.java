package clojure;

import clojure.lang.*;

public final class core_read_line extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.LineNumberingPushbackReader.class;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*in*");
 }
 public core_read_line() {
  super();
 }
 public java.lang.Object invoke() {
  try {
   if ((const__2.get() instanceof clojure.lang.LineNumberingPushbackReader)) {
    return ((java.lang.String)((clojure.lang.LineNumberingPushbackReader)const__2.get()).readLine());
   } else {
    return ((java.lang.String)((java.io.BufferedReader)const__2.get()).readLine());
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
