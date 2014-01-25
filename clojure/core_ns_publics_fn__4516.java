package clojure;

import clojure.lang.*;

public final class core_ns_publics_fn__4516 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.Var.class;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "=");
 }
 Object ns2;
 public core_ns_publics_fn__4516(final Object ns2) {
  super();
  this.ns2 = ns2;
 }
 public java.lang.Object invoke(java.lang.Object v1) {
  {
   boolean and__3966__auto__2 = (v1 instanceof clojure.lang.Var);
   if (and__3966__auto__2) {
    {
     boolean and__3966__auto__3 = clojure.lang.Util.equiv(((java.lang.Object)this.ns2), ((java.lang.Object)((clojure.lang.Namespace)((clojure.lang.Var)v1).ns)));
     if (and__3966__auto__3) {
      return (((clojure.lang.Var)v1).isPublic() ? Boolean.TRUE : Boolean.FALSE);
     } else {
      return (and__3966__auto__3 ? Boolean.TRUE : Boolean.FALSE);
     }
    }
   } else {
    return (and__3966__auto__2 ? Boolean.TRUE : Boolean.FALSE);
   }
  }
 }
}
