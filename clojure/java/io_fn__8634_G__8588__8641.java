package clojure.java;

import clojure.lang.*;

public final class io_fn__8634_G__8588__8641 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "-cache-protocol-fn");
  const__1 = (java.lang.Object)clojure.java.io.IOFactory.class;
 }
 Object G__85892;
 public io_fn__8634_G__8588__8641(final Object G__85892) {
  super();
  this.G__85892 = G__85892;
 }
 public java.lang.Object invoke(java.lang.Object gf__x__86391, java.lang.Object gf__opts__86402) {
  {
   Object cache__5922__auto__3 = ((clojure.lang.MethodImplCache)((clojure.lang.AFunction)this).__methodImplCache);
   Object f__5923__auto__4 = ((clojure.lang.IFn)((clojure.lang.MethodImplCache)cache__5922__auto__3).fnFor((java.lang.Class)((java.lang.Class)((java.lang.Class)clojure.lang.Util.classOf(((java.lang.Object)gf__x__86391))))));
   Object __r6246 = f__5923__auto__4;
   if (__r6246 != null && !(__r6246 == Boolean.FALSE)) {
    return ((IFn)f__5923__auto__4).invoke(gf__x__86391, gf__opts__86402);
   } else {
    return ((IFn)((IFn)const__0.getRawRoot()).invoke(this, gf__x__86391, const__1, this.G__85892)).invoke(gf__x__86391, gf__opts__86402);
   }
  }
 }
}
