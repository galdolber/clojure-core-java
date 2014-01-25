package clojure;

import clojure.lang.*;

public final class core_proxy_call_with_super extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "proxy-mappings");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "update-proxy");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
 }
 public core_proxy_call_with_super() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object call1, java.lang.Object this2, java.lang.Object meth3) {
  {
   Object m4 = ((IFn)const__0.getRawRoot()).invoke(this2);
   ((IFn)const__1.getRawRoot()).invoke(this2, ((IFn)const__2.getRawRoot()).invoke(m4, meth3, null));
   {
    Object ret5 = ((IFn)call1).invoke();
    ((IFn)const__1.getRawRoot()).invoke(this2, m4);
    return ret5;
   }
  }
 }
}
