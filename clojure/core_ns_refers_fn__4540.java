package clojure;

import clojure.lang.*;

public final class core_ns_refers_fn__4540 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.Var.class;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "not=");
 }
 Object ns2;
 public core_ns_refers_fn__4540(final Object ns2) {
  super();
  this.ns2 = ns2;
 }
 public java.lang.Object invoke(java.lang.Object v1) {
  {
   boolean and__3966__auto__2 = (v1 instanceof clojure.lang.Var);
   if (and__3966__auto__2) {
    return ((IFn)const__2.getRawRoot()).invoke(this.ns2, ((clojure.lang.Namespace)((clojure.lang.Var)v1).ns));
   } else {
    return (and__3966__auto__2 ? Boolean.TRUE : Boolean.FALSE);
   }
  }
 }
}
