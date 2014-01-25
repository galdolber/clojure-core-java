package clojure;

import clojure.lang.*;

public final class core_add_classpath extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "println");
 }
 public core_add_classpath() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object url1) {
  try {
   ((IFn)const__0.getRawRoot()).invoke("WARNING: add-classpath is deprecated");
   clojure.lang.RT.addURL(((java.lang.Object)url1));
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
