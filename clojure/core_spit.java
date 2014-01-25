package clojure;

import clojure.lang.*;

public final class core_spit extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.java.io", "writer");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public core_spit() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object f1, java.lang.Object content2, java.lang.Object options3) {
  try {
   {
    Object w4 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), f1, options3);
    try {
     ((java.io.Writer)w4).write((java.lang.String)((java.lang.String)((IFn)const__2.getRawRoot()).invoke(content2)));
     return null;
    } finally {
     ((java.io.Writer)w4).close();
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
