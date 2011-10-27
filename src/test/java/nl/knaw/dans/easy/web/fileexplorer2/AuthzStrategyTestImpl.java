package nl.knaw.dans.easy.web.fileexplorer2;

import java.util.ArrayList;
import java.util.List;

import nl.knaw.dans.common.lang.security.authz.AuthzMessage;
import nl.knaw.dans.common.lang.security.authz.AuthzStrategy;
import nl.knaw.dans.common.lang.user.User;

public class AuthzStrategyTestImpl implements AuthzStrategy{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean canBeDiscovered() {
		return true;
	}

	@Override
	public boolean canBeRead() {
		return true;
	}

	@Override
	public boolean canUnitBeDiscovered(String unitId) {
		return true;
	}

	@Override
	public boolean canUnitBeRead(String unitId) {
		return true;
	}

	@Override
	public TriState canChildrenBeDiscovered() {
		return TriState.ALL;
	}

	@Override
	public TriState canChildrenBeRead() {
		return TriState.ALL;
	}

	@Override
	public String explainCanChildrenBeDiscovered() {
		return "whatever";
	}

	@Override
	public List<AuthzMessage> getReadMessages() {
		return new ArrayList<AuthzMessage>();
	}

	@Override
	public AuthzMessage getSingleReadMessage() {
		return new AuthzMessage("");
	}

	@Override
	public AuthzStrategy newStrategy(User user, Object target,
			Object... contextObjects) {
		return null;
	}

	@Override
	public AuthzStrategy sameStrategy(Object target) {
		return null;
	}
}
