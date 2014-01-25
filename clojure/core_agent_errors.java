package clojure;

import clojure.lang.*;

public final class core_agent_errors extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "agent-error");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "list");
 }
 public core_agent_errors() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1) {
  {
   Object temp__4117__auto__2 = ((IFn)const__0.getRawRoot()).invoke(a1);
   Object __r2444 = temp__4117__auto__2;
   if (__r2444 != null && !(__r2444 == Boolean.FALSE)) {
    {
     Object e3 = temp__4117__auto__2;
     return ((IFn)const__1.getRawRoot()).invoke(e3);
    }
   } else {
    return null;
   }
  }
 }
}
