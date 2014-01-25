package clojure;

import clojure.lang.*;

public final class core_restart_agent extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "clear-actions");
 }
 public core_restart_agent() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object a1, java.lang.Object new_state2, java.lang.Object options3) {
  {
   Object opts4 = ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), options3);
   Object __r2441;
   Object __r2442 = RT.get(opts4, Keyword.intern(null, "clear-actions"));
   if (__r2442 != null && !(__r2442 == Boolean.FALSE)) {
    __r2441 = Boolean.TRUE;
   } else {
    __r2441 = Boolean.FALSE;
   }
   return ((java.lang.Object)((clojure.lang.Agent)a1).restart(((java.lang.Object)new_state2), (boolean)((Boolean)__r2441).booleanValue()));
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
