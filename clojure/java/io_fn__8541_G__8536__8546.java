package clojure.java;

import clojure.lang.*;

public final class io_fn__8541_G__8536__8546 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "-cache-protocol-fn");
  const__1 = (java.lang.Object)clojure.java.io.Coercions.class;
 }
 Object G__85372;
 public io_fn__8541_G__8536__8546(final Object G__85372) {
  super();
  this.G__85372 = G__85372;
 }
 public java.lang.Object invoke(java.lang.Object gf__x__85451) {
  {
   Object cache__5922__auto__2 = ((clojure.lang.MethodImplCache)((clojure.lang.AFunction)this).__methodImplCache);
   Object f__5923__auto__3 = ((clojure.lang.IFn)((clojure.lang.MethodImplCache)cache__5922__auto__2).fnFor((java.lang.Class)((java.lang.Class)((java.lang.Class)clojure.lang.Util.classOf(((java.lang.Object)gf__x__85451))))));
   Object __r6231 = f__5923__auto__3;
   if (__r6231 != null && !(__r6231 == Boolean.FALSE)) {
    return ((IFn)f__5923__auto__3).invoke(gf__x__85451);
   } else {
    return ((IFn)((IFn)const__0.getRawRoot()).invoke(this, gf__x__85451, const__1, this.G__85372)).invoke(gf__x__85451);
   }
  }
 }
}
