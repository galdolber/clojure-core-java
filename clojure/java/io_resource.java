package clojure.java;

import clojure.lang.*;

public final class io_resource extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "resource");
 }
 public io_resource() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1, java.lang.Object loader2) {
  return ((java.net.URL)((java.lang.ClassLoader)loader2).getResource((java.lang.String)((java.lang.String)n1)));
 }
 public java.lang.Object invoke(java.lang.Object n1) {
  return ((IFn)const__0.getRawRoot()).invoke(n1, ((java.lang.ClassLoader)((java.lang.Thread)((java.lang.Thread)java.lang.Thread.currentThread())).getContextClassLoader()));
 }
}
