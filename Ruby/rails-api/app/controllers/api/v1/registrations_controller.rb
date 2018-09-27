class Api::V1::RegistrationsController < Devise::RegistrationsController
  before_action :ensure_params_exist, only: :create
  # sign up
  def create
    user = User.new user_params
    if user.save
      # pulled out the method to put it in concerns/response.rb to make the code a little cleaner and having the arguments as values for the parameters of the method 
      json_response "Signed Up successfully", true, {user: user}, :ok
    else
      json_response "Something wrong", false, {}, :unprocessable_entity
    end
  end

  private
  def user_params
    params.require(:user).permit(:email, :password, :password_confirmation)
  end

  def ensure_params_exist
    return if params[:user].present?
    json_response "Missing params", false, {}, :bad_request
  end
end