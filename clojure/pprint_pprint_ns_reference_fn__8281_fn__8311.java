package clojure;

import clojure.lang.*;

public final class pprint_pprint_ns_reference_fn__8281_fn__8311 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "init-navigator");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "execute-format");
 }
 Object cf__8217__auto__15;
 public pprint_pprint_ns_reference_fn__8281_fn__8311(final Object cf__8217__auto__15) {
  super();
  this.cf__8217__auto__15 = cf__8217__auto__15;
 }
 public java.lang.Object doInvoke(java.lang.Object args__8218__auto__1) {
  {
   Object navigator__8219__auto__2 = ((IFn)const__0).invoke(args__8218__auto__1);
   return ((IFn)const__1).invoke(this.cf__8217__auto__15, navigator__8219__auto__2);
  }
 }
 public int getRequiredArity() {
  return 0;
 }
}
