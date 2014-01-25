package clojure;

import clojure.lang.*;

public final class main_load_script extends clojure.lang.AFunction {
 public static final java.lang.Object const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (java.lang.Object)2L;
  const__1 = (java.lang.Object)1L;
 }
 public main_load_script() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object path1) {
  try {
   if (((java.lang.String)path1).startsWith((java.lang.String)((java.lang.String)"@"))) {
    Object __r4467;
    if (((java.lang.String)path1).startsWith((java.lang.String)((java.lang.String)"@/"))) {
     __r4467 = 2L;
    } else {
     __r4467 = 1L;
    }
    clojure.lang.RT.loadResourceScript((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.String)path1).substring((int)RT.intCast((java.lang.Long)__r4467)))));
    return null;
   } else {
    return ((java.lang.Object)clojure.lang.Compiler.loadFile((java.lang.String)((java.lang.String)path1)));
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
