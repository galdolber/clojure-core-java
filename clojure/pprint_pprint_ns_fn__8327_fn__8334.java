package clojure;

import clojure.lang.*;

public final class pprint_pprint_ns_fn__8327_fn__8334 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "init-navigator");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "execute-format");
 }
 Object cf__8217__auto__11;
 public pprint_pprint_ns_fn__8327_fn__8334(final Object cf__8217__auto__11) {
  super();
  this.cf__8217__auto__11 = cf__8217__auto__11;
 }
 public java.lang.Object doInvoke(java.lang.Object args__8218__auto__1) {
  {
   Object navigator__8219__auto__2 = ((IFn)const__0).invoke(args__8218__auto__1);
   return ((IFn)const__1).invoke(this.cf__8217__auto__11, navigator__8219__auto__2);
  }
 }
 public int getRequiredArity() {
  return 0;
 }
}
